package mx.com.stock.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;



public class dbConection {

    private final static String createTable = "CREATE TABLE `example` (id INT, data VARCHAR(100))";

    public Connection createConnection() throws IOException, ClassNotFoundException, SQLException {

        Connection connection;
        
        Properties prop = new Properties();
        System.out.println("test");
        prop.load(new FileInputStream(System.getProperty("user.home") + "/mydb.cfg"));
        System.out.println("user.home: "+System.getProperty("user.home"));
        String host = prop.getProperty("host").toString().trim();
        String username = prop.getProperty("username").toString().trim();
        String password = prop.getProperty("password").toString().trim();
        String driver = prop.getProperty("driver").toString().trim();

        System.out.println("host: " + host + "\nusername: " + username + "\npassword: " + password + "\ndriver: " + driver);

        Class.forName(driver);
        //Class.forName("com.mysql.jdbc.Driver");
        System.out.println("--------------------------");
        System.out.println("DRIVER: " + driver);
        connection = DriverManager.getConnection(host, username, password);
        System.out.println("CONNECTION: " + connection);


        return connection;
    }

    
    public Connection createConnectionlocal() throws IOException, ClassNotFoundException, SQLException {

        Connection connection;
        Properties prop = new Properties();
        System.out.println("test");
       
        String host =  "jdbc:mysql://node14916-sysControlCu.jl.serv.net.mx/inventario";
        //String host = "jdbc:mysql://localhost/inventario";
        String username = "user";
        String password = "user1";
        System.out.println("host: " + host + "\nusername: " + username + "\npassword: " + password );
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("--------------------------");
        connection = DriverManager.getConnection(host, username, password);
        System.out.println("CONNECTION: " + connection);
        return connection;
    }

    
 /* public void runSqlStatement() {
        try {
            Statement statement = createConnection().createStatement();
            boolean rs = statement.execute(createTable);

        } catch (IOException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}*/
}
