package mx.com.stock.dao.impl;



import java.io.IOException;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import mx.com.stock.bean.Producto;
import mx.com.stock.dao.ProductoDao;
import mx.com.stock.util.dbConection;

@Repository("productoDao")
public class ProductoDaoImpl extends dbConection  implements ProductoDao {

	Statement statement;
	
	    @Override
		public List<Producto> obtieneProductoTodos() {
	
		List<Producto> list=new ArrayList<Producto>();
		try {
			statement = createConnectionlocal().createStatement();
			ResultSet rs = statement.executeQuery("select * from medicamentos");	
			while (rs.next()) 
			{
				Producto p=new Producto();	
     		    p.setIdMedicamento(rs.getInt (1));
				p.setNombre( rs.getString (2));
				p.setConcentracion(rs.getString (3));
				p.setCantidad(rs.getInt (4));
				p.setPrecio(new BigDecimal(rs.getFloat(5)));
				
			   System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getString(3)); 
			
			    list.add(p);
			} 
			
			statement.close();
			rs.close();
			createConnectionlocal().close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	  
        return list;
	}

		@Override
		public void insertarProducto(Producto producto) {
			
			 String QUERY_INSERT= "INSERT INTO medicamentos( nombre, concentracion, cantidad,precio) value (?,?,?,?)";
			try {
			
				CallableStatement callableStatement = createConnectionlocal().prepareCall(QUERY_INSERT);
				callableStatement.setString(1,producto.getNombre() );
				callableStatement.setString(2, producto.getConcentracion());
				callableStatement.setInt(3, producto.getCantidad());
				callableStatement.setBigDecimal(4,producto.getPrecio());
				
				callableStatement.executeUpdate();
				callableStatement.close();
				createConnectionlocal().close();
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			} catch (Exception e) {
		
				e.printStackTrace();
			}
			
			
		}
		

}
