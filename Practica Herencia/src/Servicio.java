import java.util.List;

public class Servicio {
    String idServicio;
    String nombre;
    List<Hospital>hospiales;
    int numeroCamas;
    String comentario;
    public Servicio(){

    }

    public Servicio(String idServicio, String nombre, List<Hospital> hospiales, int numeroCamas, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.hospiales = hospiales;
        this.numeroCamas = numeroCamas;
        this.comentario = comentario;
    }
}
