/**
 * 
 */
package uniandes.taller.grafo.tipo;

import java.util.List;

import uniandes.taller.grafo.FabricaGrafo;
import uniandes.taller.grafo.busqueda.IEstrategiaBusqueda;

/**
 * @author leonardovalbuenacalderon
 *
 */
public class GrafoDirigidoPeso implements IGrafo {

	private IEstrategiaBusqueda busqueda;

	/*
	 * (non-Javadoc)
	 * 
	 * @see uniandes.taller.IGrafo#addNodo(java.lang.String)
	 */
	@Override
	public void addNodo(String nombre) {
		System.out.println("addNodo GrafoDirigido con Peso");
		Nodo nodo = new Nodo();
		nodo.setNombre(nombre);
		nodos.add(nodo);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see uniandes.taller.IGrafo#addArco(java.lang.String, java.lang.String)
	 */
	@Override
	public void addArco(String origen, String destino) throws Exception {
		throw new UnsupportedOperationException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see uniandes.taller.IGrafo#buscarNodo(java.lang.String)
	 */
	@Override
	public Nodo buscarNodo(String nombre) {
		for (Nodo nodo : nodos) {
			if (nodo.getNombre().equals(nombre)) {
				return nodo;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see uniandes.taller.IGrafo#existeRuta(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean existeRuta(String origen, String destino) throws Exception {
		IEstrategiaBusqueda busqueda = FabricaGrafo.obtenerEstrategiaBusqueda();
		return busqueda.existeRuta(this, origen, destino);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see uniandes.taller.IGrafo#buscarRuta(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Nodo> buscarRuta(String origen, String destino) throws Exception {
		busqueda = FabricaGrafo.obtenerEstrategiaBusqueda();
		return busqueda.buscarRuta(this, origen, destino);
	}

	@Override
	public void addArco(String origen, String destino, int peso) throws Exception {
		Nodo nodoOrigen = buscarNodo(origen);
		Nodo nodoDestino = buscarNodo(destino);

		// Origen o destino no encontrado
		if (nodoOrigen == null) {
			throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
		}
		if (nodoDestino == null) {
			throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
		}

		addArco(nodoOrigen, nodoDestino, peso);

	}

	private void addArco(Nodo nodoOrigen, Nodo nodoDestino, int peso) {
		Arco arco = new Arco();
		arco.setOrigen(nodoOrigen);
		arco.setDestino(nodoDestino);
		arco.setPeso(peso);
		arcos.add(arco);
		nodoOrigen.agregarArco(arco);
	}

}
