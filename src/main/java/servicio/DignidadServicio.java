/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Dignidad;

/**
 *
 * @author ASUS
 */
public class DignidadServicio implements IDignidadServicio{
   private static List<Dignidad> dignidadList = new ArrayList<>(); 

    @Override
    public Dignidad crear(Dignidad dignidad) {
        this.dignidadList.add(dignidad);
        return dignidad;
    }

    @Override
    public List<Dignidad> listar() {
        return this.dignidadList;
    }
   
}
