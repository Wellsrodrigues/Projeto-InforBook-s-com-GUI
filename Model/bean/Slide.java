
package Model.bean;

public class Slide {
    private int Id;
    private String Nome, Disciplina, Tema;
    
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String tema) {
        this.Tema = tema;
    }
    
    
}
