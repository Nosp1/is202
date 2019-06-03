/*
 * Tools to connect to a database
 * We define a DataSource, either in 
        - Tomcat \conf\context.xml
        - Project, in web\META-INF\context.xml
 *  Purpose of DataSource is to get a secure and easy way to connect 
    to the database https://en.wikipedia.org/wiki/Datasource 
 */
package klasser;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author hallgeir
 */
public class DBTools {
    
    public Connection loggInn(PrintWriter out) {
        try {
         Connection tmpConnection;    
         // Step 1: Allocate a database 'Connection' object
         Context cont = new InitialContext();
         DataSource ds = (DataSource)cont.lookup("java:comp/env/jdbc/localhostDS");  
         //DataSource ds = (DataSource)cont.lookup("jdbc/LocalhostDS");
         tmpConnection =  ds.getConnection();
             
         return tmpConnection;
        }
        catch (SQLException ex ) {
            out.println("Not connected to database " +ex);
        }
        catch (NamingException nex) {
            out.println("Not correct naming" + nex);
        }
            
        return null;     
    }
   
}
