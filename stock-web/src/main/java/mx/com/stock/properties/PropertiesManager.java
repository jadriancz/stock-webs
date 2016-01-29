/**
 * PropertiesManager.java
 * 1.1.0
 * 15 Mayo 2013
 * Circulo de CrÈdito
 */
package mx.com.stock.properties;

import java.util.Properties;
import java.util.Set;


public class PropertiesManager {
	
	/**
	 * Instancia de la clase
	 */
	public static PropertiesManager instance;
	
	/**
	 * Representa los properties
	 */
	private static Properties properties;
		
	/**
	 * Se asegura de que no se pueda instanciar la clase fuera de esta
	 */
	private PropertiesManager(){
		properties = new Properties();
	}
	
	/**
	 * Crea o retorna siempre la misma instancia del PropertiesManager
	 * @return
	 */
	public static PropertiesManager getInstance(){
		if (instance==null){
			instance = new PropertiesManager();
		}
		return instance;
	}
	
	/**
	 * Obtiene el valor del property
	 * @param propertiesKeys -> llave del property
	 * @return String -> Contiene el valor del property
	 */
	public synchronized String getValue(PropertiesKeys propertiesKeys){
		return properties.getProperty(propertiesKeys.getKey());
	}
	
	/**
	 * Agrega properties al PropertieManager
	 * @param properties -> contiene los properties que se agregaran al PropertieManager 
	 */
	protected static void addProperties(Properties properties){
		getInstance();
		Set<?>keys = properties.keySet();
		for (Object key : keys){
			Object value = properties.get(key);
			PropertiesManager.properties.put(key, value);
		}
	}

}