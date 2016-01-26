package mx.com.stock.dao.impl;



import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mx.com.stock.bean.Producto;
import mx.com.stock.dao.ProductoDao;
import mx.com.stock.util.dbConection;

public class ProductoDaoImpl extends dbConection  implements ProductoDao {

		public List<Producto> obtieneProductoTodos() {
		Statement statement;
		List<Producto> list=new ArrayList<Producto>();
		try {
			statement = createConnection().createStatement();
			ResultSet rs = statement.executeQuery("select * from medicamentos");	// TODO Auto-generated method stub
			while (rs.next()) 
			{
				Producto p=new Producto();	
				p.setIdMedicamento(rs.getInt (1));
				p.setNombre( rs.getString (2));
				p.setConcentracion(rs.getString (3));
			    System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getString(3)); 
			
			    list.add(p);
			}    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
        return list;
	}

}
