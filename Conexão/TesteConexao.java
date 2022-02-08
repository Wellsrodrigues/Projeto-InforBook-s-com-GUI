/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Windows
 */
public class TesteConexao {

    public static void main(String[] args) {
        
      Connection com = null;
      com = (Connection) ConnectionFactory.getConnection();
      
    }
    
}
