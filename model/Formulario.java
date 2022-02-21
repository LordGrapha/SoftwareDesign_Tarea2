/**
 * Formulario
 */
public class Formulario {

    private int num;
    private TEstado estado;
    private Carrera carreraSolicitada;
    private int puntajeObtenido;

    public Formulario(int pNum, TEstado pEstado, Carrera pCarrera, int pPuntuaje){
        this.num = pNum;
        this.estado = pEstado;
        this.carreraSolicitada = pCarrera;
        this.puntajeObtenido = pPuntuaje;
    }

}