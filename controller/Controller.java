import java.util.ArrayList;

public class Controller {

    private GestorCarreras gCarreras;
    private GestorFormulario gFormularios;

    public Controller(){
        this.gCarreras = new GestorCarreras();
        this.gFormularios = new GestorFormulario();
    }

    public boolean crearCarrer(String pCodigo, String pNombre, int pPuntajeAdmin,
                                int pCapacidadMax, TGrado pGrado, Sede pLaSede){

    }

    public ArrayList<Carrera> visualizarCarreras(){

    }

    public Carrera getCarrera(String pCodigo, String pCodigoSede){

    }

    public boolean editarCarrera(Carrera pCarrera){

    }

    public boolean crearFormulario(Formulario pUnFormulario){

    }

    public boolean simularAplicacionExamen(){

    }

    public boolean procesarResultados(){

    }

    public ArrayList<Formulario> visualizarSolicitudes(){

    }

    public ArrayList<Formulario> verFormularios(TEstado pEstado, boolean pPorNombre){
        
    }

}