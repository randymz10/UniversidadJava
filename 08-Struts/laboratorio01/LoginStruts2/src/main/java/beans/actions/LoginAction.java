package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String usuario;
    private String password;
    
    public String execute(){
        log.info("El usuario es: " + this.usuario);
        log.info("La contraseña es: " + this.password);
        return SUCCESS;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFormUsuario(){
        return getText("form.usuario");
    }
    
    public String getFormPassword() {
        return getText("form.password");
    }
    
    public String getFormTitulo(){
        return getText("form.titulo");
    }
    
    public String getFormValores(){
        return getText("form.valores");
    }
    
    public String getFormBoton() {
        return getText("form.boton");
    }
    
}
