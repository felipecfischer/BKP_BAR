package DAL;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public static Connection conexaoBD(){
        Connection conn;
        Statement cmd;
        String url = "jdbc:odbc:Bar";
        
        try {
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\bdDulce\\bar.accdb");            
            JOptionPane.showMessageDialog(null, "           Bem-Vindo!");   
            cmd = conn.createStatement();
            return conn;
        } 
        catch (SQLException Error) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar ao banco!\n" + Error);    
            return null;
        } 
    }
}
