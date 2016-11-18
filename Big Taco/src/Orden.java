/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CETECOM
 */

//prueba de github
public class Orden {
    private String nombreCliente;
    private String tamañoTaco;
    private String base;
    String ingredientes[] = new String[7];
    
    
    public Orden(String nombreCliente, String tamañoTaco, String base) {
        this.nombreCliente = nombreCliente;
        this.tamañoTaco = tamañoTaco;
        this.base = base;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTamañoTaco() {
        return tamañoTaco;
    }

    public String getBase() {
        return base;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTamañoTaco(String tamañoTaco) {
        this.tamañoTaco = tamañoTaco;
    }

    public void setBase(String base) {
        this.base = base;
    }
    
}
