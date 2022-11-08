package beans.actions;

import org.apache.logging.log4j.*;

public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtr;
    
    public String execute(){
        log.info("ejecutando metodo execute desde strtuts2");
        this.saludosAtr = "Saludos desde Struts2 con convenciones";
        return "exito";
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
    
}
