package beans;

import java.io.Serializable;

public class PersonajeBean implements Serializable {
    private int foto;
    private String nombre;
    private String descripcion;
    private int diseño;

    public PersonajeBean(int foto, String nombre, String descripcion, int diseño) {
        this.descripcion = descripcion;
        this.diseño = diseño;
        this.foto = foto;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDiseño() {
        return diseño;
    }

    public void setDiseño(int diseño) {
        this.diseño = diseño;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
