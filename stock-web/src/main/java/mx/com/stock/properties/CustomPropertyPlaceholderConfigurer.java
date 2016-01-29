/**
 * CustomPropertyPlaceholderConfigurer.java
 * 1.1.0
 * 15 Mayo 2013
 * Circulo de Crédito
 */
package mx.com.stock.properties;

import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;



public class CustomPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	/**
	 * Agrega los properties al PropertiesManager
	 */
	@Override
	protected void convertProperties(Properties properties) {
		PropertiesManager.addProperties(properties);
		super.convertProperties(properties);
	}
	
	
	
	
	
}
