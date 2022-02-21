public class Carrera {
    private String codigo;
    private String nombre;
    private int puntajeObtenido;
    private int capacidadMax;
    private TGrado grado;
    private Sede laSede;

    public Carrera(String pCodigo, String pNombre, int pPuntuaje,
                    int pCapacidad, TGrado pGrado, Sede pLaSede){
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.puntajeObtenido = pPuntuaje;
        this.capacidadMax = pCapacidad;
        this.grado = pGrado;
        this.laSede = pLaSede;
    }

}
