package mx.com.stock.bean;

import java.io.Serializable;

public class Producto implements Serializable {
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 6181099785321097374L;
		private int idMedicamento;
	    private String nombre;
	    private String concentracion;
	    
	
	    
	    
		public int getIdMedicamento() {
			return idMedicamento;
		}
		public void setIdMedicamento(int idMedicamento) {
			this.idMedicamento = idMedicamento;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getConcentracion() {
			return concentracion;
		}
		public void setConcentracion(String concentracion) {
			this.concentracion = concentracion;
		}
	    
	    
	    
	    
}
