package mx.com.stock.web.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import mx.com.stock.bean.Producto;
import mx.com.stock.dao.impl.ProductoDaoImpl;


@ViewScoped
@ManagedBean
public class StockManagedBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3852617044535624783L;
	private List<Producto> producto;

	
	
    @SuppressWarnings("compatibility:4532054810383031885")

	@PostConstruct
	    public void init() {
    	
    	consultaProducto();
		}

    
  public void  consultaProducto(){
	  
	  producto =new ProductoDaoImpl().obtieneProductoTodos();
	    
	  
  }
  
  
    
    

	public List<Producto> getProducto() {
		return producto;
	}


	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}


	
	
	
}
