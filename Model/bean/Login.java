
package Model.bean;


public class Login {
     private String User;
     private String Password;

    public Login(String Adm, String SenhaAdm) {
        this.User = Adm;
        this.Password = SenhaAdm;
    }
     
     
    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
