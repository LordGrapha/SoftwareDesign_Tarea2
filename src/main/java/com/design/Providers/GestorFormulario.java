package com.design.Providers;

import java.util.ArrayList;

import com.design.Model.Formulario;
import com.design.Model.TEstado;

public class GestorFormulario {
    
    public GestorFormulario(){
        
    }

    public boolean agregarFormulario(Formulario pFormulario){
        try {
            
            return true;
        } catch (Exception e) {
            //TODO: handle exception
            return false;
        }
    }

    public boolean aplicarSimulacion(){
        try {
            
            return true;
        } catch (Exception e) {
            //TODO: handle exception
            return false;
        }
    }

    public boolean definirResultados(){
        try {
            
            return true;
        } catch (Exception e) {
            //TODO: handle exception
            return false;
        }
    }

    public ArrayList<Formulario> getSolicitudes(){
        ArrayList<Formulario> resultado = new ArrayList<>();

        return resultado;
    }

    public ArrayList<Formulario> getSolicitudesPorNombre(TEstado pEstado){
        ArrayList<Formulario> resultado = new ArrayList<>();

        return resultado;
    }

    public ArrayList<Formulario> getSolicitudesPorPuntaje(TEstado pEstado){
        ArrayList<Formulario> resultado = new ArrayList<>();

        return resultado;
    }    
}
