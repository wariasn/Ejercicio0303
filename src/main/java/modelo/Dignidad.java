/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Dignidad {
    
    private String cargo;
    private String parroquia;
    private String canton;
    private String provincia;
    private Eleccion eleccion;

    public Dignidad(String cargo, String parroquia, String canton, String provincia, Eleccion eleccion) {
        this.cargo = cargo;
        this.parroquia = parroquia;
        this.canton = canton;
        this.provincia = provincia;
        this.eleccion = eleccion;
    }

    public Dignidad(String cargo, String parroquia, String canton, String provincia) {
        this.cargo = cargo;
        this.parroquia = parroquia;
        this.canton = canton;
        this.provincia = provincia;
    }

    public Dignidad() {
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }

    @Override
    public String toString() {
        return "Dignidad{" + "cargo=" + cargo + ", parroquia=" + parroquia +
               ", canton=" + canton + ", provincia=" + provincia + '}';
    }
    
    
    
}
