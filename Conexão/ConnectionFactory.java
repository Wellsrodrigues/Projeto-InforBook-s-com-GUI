//Classe de coneção com Banco de dados
package Conexão;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
   //Componentes da conexão
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/estantevirtual";
    private static final String USER = "root";
    private static final String PASS = "12345";
    
    private static Connection conexao;
    
    //Metodo abrir conexão
    public static Connection getConnection(){
        try{
               Class.forName(DRIVER);
               conexao =  (Connection) DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Conectado ao banco de dados!");
                return conexao;
         } catch (ClassNotFoundException | SQLException ex) {
               throw new RuntimeException("Erro de Conexão!", ex);
         }
        
    }
    
    //Metodo fechar conexão
    public static void closeConnection(Connection con){
            try {
                if(con != null){
                    con.close();
                    System.out.println("Conexão encerrada!");
                }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro! Conexão ainda aberta!", ex);
        }
    }

//Metodo fechar conexão e consulta
    public static void closeConnection(Connection con, PreparedStatement stmt){
    closeConnection(con);
            try {
                if(stmt != null){
                    stmt.close();
                    System.out.println("Consulta encerrada!");
                }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro! Conexão e consulta ainda abertas!", ex);
        }
    }
    
    //Metodo fechar conexão, consulta e resultados
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
    closeConnection(con, stmt);
            try {
                if(rs != null){
                    rs.close();
                    System.out.println("Consulta encerrada!");
                }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro! Conexão, consulta e resultados não encerrados!", ex);
        }
    }
   
}