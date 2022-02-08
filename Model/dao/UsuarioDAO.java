
package Model.dao;

import Conexão.ConnectionFactory;
import Model.bean.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO extends Usuario{
    
    
    public boolean VerificarLogin(String login, String senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean result = false;
        
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Usuario WHERE nome = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                result = true;              
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Usuário não cadastrado!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return result;
    }
    
    public void create(Usuario pess){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Usuario (Nome, Senha, Email)"
                    + " VALUES  (?, ?, ?, ?) " );
            
            stmt.setString(1, pess.getNome());
            stmt.setString(2, pess.getNome());
            stmt.setString(3, pess.getSenha());
            stmt.setString(4, pess.getEmail());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operação de insersão realizada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Operação de insersão não realizada!"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
     public List<Usuario> read() {
         
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Usuario> usuarios  = new ArrayList();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usu = new Usuario();

                usu.setId(rs.getInt("Id"));
                usu.setNome(rs.getString("Nome"));
                usu.setSenha(rs.getString("Senha"));
                usu.setEmail(rs.getString("Email"));

                usuarios.add(usu);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuarios;
    }
    
     
      public boolean update(Usuario pess){
        
        String sql = "UPDATE Usuario SET Nome = ?, Senha = ?, Email = ?  WHERE id = ?";
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
           stmt = (PreparedStatement) con.prepareStatement(sql);
           
            stmt.setString(1, pess.getNome());
            stmt.setString(2, pess.getSenha());
            stmt.setString(3, pess.getEmail());
            stmt.setInt(4, pess.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Informações Atualizadas!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Operação de atualização não realizada!"+ex);
            return false;
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
     
      
      /////METODO DE EXCLUSAO
     public boolean delete(Usuario pess){
        Connection con = ConnectionFactory.getConnection();
        String sql = "DELETE FROM Usuario WHERE id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
           stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, pess.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario deletado!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Operação de exclusão não realizada!"+ex);
            return false;
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
}
