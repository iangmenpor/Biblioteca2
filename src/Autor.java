import java.util.ArrayList;

public class Autor {
    private String nombre;
    private String apellidos;
    private String nacimiento;
    private String localidadnacimiento;

    public ArrayList<Autor> autor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getLocalidadnacimiento() {
        return localidadnacimiento;
    }

    public void setLocalidadnacimiento(String localidadnacimiento) {
        this.localidadnacimiento = localidadnacimiento;
    }
}
