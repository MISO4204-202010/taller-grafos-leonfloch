/**
 * 
 */
package uniandes.taller.grafo;

import java.io.FileReader;
import java.util.Properties;

import uniandes.taller.grafo.busqueda.IEstrategiaBusqueda;
import uniandes.taller.grafo.tipo.IGrafo;

/**
 * @author leonardovalbuenacalderon
 *
 */
public class FabricaGrafo {

	/**
	 * indica el tipo de grafo que se va a instancia
	 */
	private static final String GRAFO_A_CARGAR = "dirigido";
	
	/**
	 * estrategia de busqueda seleccionada
	 */
	private static final String ESTRATEGIA_BUSQUEDA = "estrategiaBFS";
	
	private static IGrafo grafo;

	
	/**
	 * Crea un grafo basado en el archivo de propiedades
	 * 
	 * @return
	 */
	public static IGrafo obtenerNuevoGrafo() {		
		String opcion = FabricaGrafo.getOpcionConfigurada(GRAFO_A_CARGAR);
		try {
			grafo = (IGrafo) Class.forName(opcion).newInstance();
		} catch (Exception e) {
			throw new RuntimeException("No se pudo crear el grafo");
		}
		return grafo;
	}
	
	/**
	 * Crea una estrategia de busqueda basado en el archivo de propiedades
	 * @return
	 */
	public static IEstrategiaBusqueda obtenerEstrategiaBusqueda() {
		IEstrategiaBusqueda estrategiaBusqueda = null;
		String opcion = FabricaGrafo.getOpcionConfigurada(ESTRATEGIA_BUSQUEDA);
		try {
			estrategiaBusqueda = (IEstrategiaBusqueda) Class.forName(opcion).newInstance();
		} catch (Exception e) {
			throw new RuntimeException("No se pudo crear la estrategia de busqueda");
		}
		return estrategiaBusqueda;
	}

	/**
	 * Carga la opcion de grafo definida para crear el grafo
	 * @return
	 */
	private static String getOpcionConfigurada(String opcion) {
		Properties opciones = new Properties();
		try {
			opciones.load(new FileReader("config.properties"));
		} catch (Exception e) {

		}
		return opciones.getProperty(opcion);

	}

}
