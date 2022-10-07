import java.util.List;

public class Hospital {
    String codHospital;
    String nombre;
    Ciudad ciudad;
    int telefono;
    List<Servicio>servicio;
    Medico director;

    public Hospital(){

    }

    public Hospital(String codHospital, String nombre, Ciudad ciudad, int telefono, List<Servicio> servicio, Medico director) {
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicio = servicio;
        this.director = director;
    }
}
