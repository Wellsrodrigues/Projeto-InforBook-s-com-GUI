
package Model.dao;

import javax.swing.JOptionPane;
import Conexão.ConnectionFactory;
import Model.bean.Livro;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class LivroDAO {
    private Connection con = null;
    
    
    ///CRUD
    ///// METODO INSERIR
    public boolean create(Livro book){
         con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO Livro (Disciplina, Serie, Colecao, PeriodoUso) VALUES (?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
           stmt = (PreparedStatement) con.prepareStatement(sql);
            
 
            stmt.setString(1, book.getDiscipl());
            stmt.setString(2, book.getSerie());
            stmt.setString(3, book.getColeçao());
            stmt.setString(4, book.getPeriodoUso());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Operação de insersão realizada!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Operação de insersão não realizada!"+ex);
            return false;
        }finally{
           ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    ///METODO DE CONSULTA
    public List<Livro> read(){
        
        String sql = "SELECT *FROM Livro";
        
         PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Livro> livros = new ArrayList();
        
        try {
            
            stmt = (PreparedStatement) con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Livro book = new Livro();
                
                 book.setId(rs.getInt("IdLivro"));
                 book.setDiscipl(rs.getString("DisciplinaLivro"));
                 book.setSerie(rs.getString("SerieLivro"));
                 book.setColeçao(rs.getString("ColeçaoLivro"));
                 book.setPeriodoUso(rs.getString("PeriodoUso"));
                 
                livros.add(book);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return livros;
    }
    
    
    ////METODO DE ATUALIZAÇAO 
     public boolean update(Livro book){
        
        String sql = "UPDATE Livro SET Disciplina = ?, Serie = ?, Coleçao = ?, PeriodoUso = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
           stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, book.getDiscipl());
            stmt.setString(2, book.getSerie());
            stmt.setString(3, book.getColeçao());
            stmt.setString(4, book.getPeriodoUso());
            stmt.setInt(5, book.getId());
            
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
     public boolean delete(Livro book){
        
        String sql = "DELETE FROM Livro WHERE id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
           stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setInt(1, book.getId());
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
