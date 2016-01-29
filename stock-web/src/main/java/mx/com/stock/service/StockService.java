package mx.com.stock.service;

import java.util.List;

import javax.faces.bean.ManagedProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.stock.bean.Producto;
import mx.com.stock.dao.ProductoDao;

@Service("stockService")
public class StockService {

	
	@Autowired
    private ProductoDao productoImpl;
	
	
	  public  List<Producto> consultaProducto(){
			List<Producto> listaProducto= getProductoImpl().obtieneProductoTodos();
			return  listaProducto; 
		  }

	  public void guardarProducto(Producto producto){
		  productoImpl.insertarProducto(producto);
	  }
	  
	  
	  public ProductoDao getProductoImpl() {
		return productoImpl;
	}

	public void setProductoImpl(ProductoDao productoImpl) {
		this.productoImpl = productoImpl;
	}
	  
	
}
