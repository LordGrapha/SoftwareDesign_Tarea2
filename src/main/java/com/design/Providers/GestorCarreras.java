package com.design.Providers;

import java.util.ArrayList;

import com.design.Model.Carrera;
import com.design.Model.Sede;
import com.design.Model.TGrado;

public class GestorCarreras {

    public GestorCarreras() {

    }

    public boolean agregarCarreras(Carrera pCarrera) {
        try {

            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    public ArrayList<Carrera> buscarCarreras() {
        ArrayList<Carrera> resultado = new ArrayList<>();
        return resultado;
    }

    public Sede buscarSede(String pCodigo) {
        Sede sede = new Sede(pCodigo, "sede Encontrada");
        return sede;
    }

    public Carrera buscarCarrera(String pCodigo, String pCodigoSede) {
        Carrera carrera = new Carrera(pCodigo, "Carrera encontrada", 546, 150,
                TGrado.BACHILLERATO, new Sede("AG132", "Una Sede"));
        return carrera;
    }

    public boolean modificarCarrera(Carrera pCarrera, String pCodigoSede) {
        try {

            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    public Carrera buscarCarreraPorSede(String pCodigoSede) {
        Carrera carrera = new Carrera(pCodigoSede, "Carrera encontrada", 546, 150,
                TGrado.BACHILLERATO, new Sede("AG132", "Una Sede"));
        return carrera;
    }

}