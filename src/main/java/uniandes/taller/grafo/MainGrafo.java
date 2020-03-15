/**
 * 
 */
package uniandes.taller.grafo;

import java.util.List;

import uniandes.taller.grafo.tipo.IGrafo;
import uniandes.taller.grafo.tipo.Nodo;

/**
 * @author leonardovalbuenacalderon
 *
 */
public class MainGrafo {

	private static IGrafo g;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// utiliza la fabrica para instanciar el grafo
			g = FabricaGrafo.obtenerNuevoGrafo();

			g.addNodo("A");
			g.addNodo("B");
			g.addNodo("C");

			g.addArco("A", "B");
			g.addArco("B", "C");
			g.addArco("A", "C");

			List<Nodo> camino = g.buscarRuta("A", "C");

			if (camino == null) {
				System.out.println("Camino A -> C no encontrado");
			} else {
				System.out.println("Camino A -> C encontrado");
				for (Nodo nodo : camino) {
					System.out.println(nodo.getNombre());
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
