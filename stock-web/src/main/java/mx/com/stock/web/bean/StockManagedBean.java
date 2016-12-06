package mx.com.stock.web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.stock.bean.Producto;
import mx.com.stock.dao.ProductoDao;
import mx.com.stock.dao.impl.ProductoDaoImpl;
import mx.com.stock.service.StockService;

@ViewScoped
@ManagedBean(name = "stockManaged")
public class StockManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3852617044535624783L;
	private List<Producto> listaProducto;
	private Producto producto;

	@ManagedProperty(value = "#{stockService}")
	private StockService stockService;

	@SuppressWarnings("compatibility:4532054810383031885")

	@PostConstruct
	public void init() {
		listaProducto =new ArrayList<Producto>();
        setProducto(new Producto());
		consultaServiceMedicamentos();
		producto= new Producto(); 
	}

	public void consultaServiceMedicamentos() {

		listaProducto = getStockService().consultaProducto();

	}

	public void guardarProducto() {
		getStockService().guardarProducto(producto);
		setProducto(new Producto());
		consultaServiceMedicamentos();
		
		

	}

	public List<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public StockService getStockService() {
		return stockService;
	}

	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}

}
