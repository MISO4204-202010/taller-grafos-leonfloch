/**
 * 
 */
package uniandes.taller.grafo.busqueda;

import java.util.List;

import uniandes.taller.grafo.tipo.IGrafo;
import uniandes.taller.grafo.tipo.Nodo;

/**
 * @author leonardovalbuenacalderon
 *
 */
public class EstrategiaBusquedaDFS implements IEstrategiaBusqueda {

	/* (non-Javadoc)
	 * @see uniandes.taller.grafo.IEstrategiaBusqueda#existeRuta(uniandes.taller.grafo.IGrafo, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean existeRuta(IGrafo grafo, String origen, String destino) throws Exception {
		System.out.print("existeRuta EstrategiaBusquedaDFS");
		return false;
	}

	/* (non-Javadoc)
	 * @see uniandes.taller.grafo.IEstrategiaBusqueda#buscarRuta(uniandes.taller.grafo.IGrafo, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Nodo> buscarRuta(IGrafo grafo, String origen, String destino) throws Exception {
		System.out.print("buscarRuta EstrategiaBusquedaDFS");
		return null;
	}

}
