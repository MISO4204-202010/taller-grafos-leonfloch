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
public interface IEstrategiaBusqueda {

	boolean existeRuta(IGrafo grafo, String origen, String destino) throws Exception;

	List<Nodo> buscarRuta(IGrafo grafo, String origen, String destino) throws Exception;

}
