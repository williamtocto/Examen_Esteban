
package modelo;

public class Dueño {
    
    private String cedula;
    private String Nombre;
    private int edad;
    private String sexo;
    private int departamento;
    private String estado;

    public Dueño(String cedula, String Nombre, int edad, String sexo, int departamento, String estado) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.departamento = departamento;
        this.estado = estado;
    }

    public Dueño() {
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
