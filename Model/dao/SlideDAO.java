
package Model.dao;

import Conexão.ConnectionFactory;
import Model.bean.Slide;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class SlideDAO {
     private Connection con = null;
     
    public void create(Slide slid){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Slide (Nome, Disciplina, Tema)"
                    + " VALUES  (?, ?, ?) " );
      
            stmt.setString(1, slid.getNome());
            stmt.setString(2, slid.getDisciplina());
            stmt.setString(3, slid.getTema());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operação de insersão realizada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Operação de insersão não realizada!"+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
      ///METODO DE CONSULTA
    public List<Slide> read(){
        
         Connection con = ConnectionFactory.getConnection();
         PreparedStatement stmt = null;
         ResultSet rs = null;
         List<Slide> slides = new ArrayList();
        
        String sql = "SELECT *FROM Slide";
        
        try {
            stmt = (PreparedStatement) con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Slide slid = new Slide();
                
                 slid.setId(rs.getInt("Id"));
                 slid.setNome(rs.getString("Nome"));
                 slid.setDisciplina(rs.getString("Disciplina"));
                 slid.setTema(rs.getString("Tema"));
                
                 
                slides.add(slid);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return slides;
    }
    
    
    ////METODO DE ATUALIZAÇAO
     public boolean update(Slide slid){
         
        Connection con = ConnectionFactory.getConnection();
        String sql = "UPDATE Slide SET  Nome = ?, Disciplina= ?, Tema = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, slid.getNome());
            stmt.setString(2, slid.getDisciplina());
            stmt.setString(3, slid.getTema());
            stmt.setInt(4, slid.getId());
            
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
     public boolean delete(Slide slid){
        Connection con = ConnectionFactory.getConnection();
        String sql = "DELETE FROM Livro WHERE id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
           stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, slid.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Livro deletado!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Operação de exclusão não realizada!"+ex);
            return false;
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
}
