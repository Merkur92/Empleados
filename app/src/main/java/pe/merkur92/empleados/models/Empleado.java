package pe.merkur92.empleados.models;

public class Empleado {

    private Integer id;
    private String fullname;
    private String cargo;
    private String email;
    private Integer telefono;

    public Empleado(Integer id, String fullname, String cargo, String email, Integer telefono) {
        this.id = id;
        this.fullname = fullname;
        this.cargo = cargo;
        this.email = email;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }


}
