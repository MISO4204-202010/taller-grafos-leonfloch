/**
 * 
 */
package uniandes.taller.grafo.tipo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonardovalbuenacalderon
 *
 */
public interface IGrafo {
	
	
	
	List<Nodo> nodos = new ArrayList<>();
	List<Arco> arcos = new ArrayList<>();
	
	void addNodo(String nombre);
	
	void addArco(String origen, String destino) throws Exception;
	
	void addArco(String origen, String destino, int peso) throws Exception;
	
	Nodo buscarNodo(String nombre);
	
	boolean existeRuta(String origen, String destino) throws Exception;
	
	List<Nodo> buscarRuta(String origen, String destino) throws Exception;

}
