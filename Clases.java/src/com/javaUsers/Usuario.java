package com.javaUsers;

/**
 * Se crea clase Usuario
 * 
 * @author javaUsers
 * @version 1.0
 */

public class Usuario {
    private int Id;
    private String nombres;
    private String correo;
    private String telefono;
    private String edad;

    public Usuario() {
    }

    /**
     * Se Crea el constructor
     * 
     * @param id
     * @param nombres
     * @param correo
     * @param telefono
     * @param edad
     */
    public Usuario(int id, String nombres, String correo, String telefono, String edad) {
        Id = id;
        this.nombres = nombres;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    /**
     * Se generan los metodos get y set
     * 
     */
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (Id != other.Id)
            return false;
        return true;
    }

    /**
     * Se genera metodo toString
     */
    @Override
    public String toString() {
        return "Usuario [Id=" + Id + ", nombres=" + nombres + ", correo=" + correo + ", telefono=" + telefono
                + ", edad="
                + edad + "]";
    }

}
