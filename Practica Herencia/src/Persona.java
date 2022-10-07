public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    String DNI;
    String fechaNAcimiento;
    public Persona(){

    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String DNI, String fechaNAcimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.DNI = DNI;
        this.fechaNAcimiento = fechaNAcimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNAcimiento() {
        return fechaNAcimiento;
    }

    public void setFechaNAcimiento(String fechaNAcimiento) {
        this.fechaNAcimiento = fechaNAcimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNAcimiento='" + fechaNAcimiento + '\'' +
                '}';
    }
}
