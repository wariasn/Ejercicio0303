/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import modelo.Candidato;
import servicio.CandidatoServicio;
import servicio.DignidadServicio;

/**
 *
 * @author ASUS
 */
public class CandidatoControl {
    
    private final CandidatoServicio candidatoServicio = new CandidatoServicio();
    //private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Candidato crear(String[] args){
        var fechaNacimiento = LocalDate.of(Integer.valueOf(args[2]),
                Integer.valueOf(args[3]), 
                Integer.valueOf(args[4])); 
        //var dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[6]));
        var candidato = new Candidato(args[0],Integer.valueOf(args[1]),fechaNacimiento,args[5]);
        this.candidatoServicio.crear(candidato);
        return candidato;
    }
    
    public List<Candidato> listar(){
        return this.candidatoServicio.listar();
    }
}
