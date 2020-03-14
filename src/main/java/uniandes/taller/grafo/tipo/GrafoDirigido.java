/**
 * 
 */
package uniandes.taller.grafo.tipo;

import java.util.List;

import uniandes.taller.grafo.busqueda.IEstrategiaBusqueda;

/**
 * @author leonardovalbuenacalderon
 *
 */
public class GrafoDirigido implements IGrafo {
	
	
	
	private IEstrategiaBusqueda busqueda;

	/* (non-Javadoc)
	 * @see uniandes.taller.IGrafo#addNodo(java.lang.String)
	 */
	@Override
	public void addNodo(String nombre) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see uniandes.taller.IGrafo#addArco(java.lang.String, java.lang.String)
	 */
	@Override
	public void addArco(String origen, String destino) throws Exception {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see uniandes.taller.IGrafo#buscarNodo(java.lang.String)
	 */
	@Override
	public Nodo buscarNodo(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see uniandes.taller.IGrafo#existeRuta(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean existeRuta(String origen, String destino) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see uniandes.taller.IGrafo#buscarRuta(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Nodo> buscarRuta(String origen, String destino) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addArco(String origen, String destino, int peso) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
