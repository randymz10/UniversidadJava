package domain;

import java.util.Date;

public class Cliente extends Persona{
    
    private int idCliente;
    private Date fechaRegistro = new Date();
    private boolean vip;
    
    private static int contadorCliente;

    public Cliente(String nombre, boolean vip) {
        super(nombre);
        
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        
        this.idCliente = ++Cliente.contadorCliente;
    }

    public int getIdCliente() {
        return this.idCliente;
    }


    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro.toString());
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}


