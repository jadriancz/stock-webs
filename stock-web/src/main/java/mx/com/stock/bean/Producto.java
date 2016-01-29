package mx.com.stock.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Producto implements Serializable {
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 6181099785321097374L;
		private int idMedicamento;
	    private String nombre;
	    private String concentracion;
	    private int cantidad;
	    private BigDecimal precio;
	
	    
	    
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
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public BigDecimal getPrecio() {
			return precio;
		}
		public void setPrecio(BigDecimal precio) {
			this.precio = precio;
		}
	    
	    
	    
	    
}
