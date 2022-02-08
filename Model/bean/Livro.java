
package Model.bean;

public class Livro {
    private int id;
    private String Disciplina, Serie, Coleçao, PeriodoUso;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDiscipl() {
        return Disciplina;
    }

    public void setDiscipl(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getColeçao() {
        return Coleçao;
    }

    public void setColeçao(String Coleçao) {
        this.Coleçao = Coleçao;
    }

    public String getPeriodoUso() {
        return PeriodoUso;
    }

    public void setPeriodoUso(String PeriodoUso) {
        this.PeriodoUso = PeriodoUso;
    }

    
}
