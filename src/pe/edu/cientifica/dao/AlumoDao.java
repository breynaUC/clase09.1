/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.cientifica.entity.Alumno;

/**
 *
 * @author docente
 */
public class AlumoDao {
    private List<Alumno> lista;
    public AlumoDao(){
        lista= new ArrayList<>();
    }
    public void registrar(Alumno alum){
        lista.add(alum);
    }

    public List<Alumno> getLista() {
        return lista;
    }
    
}
