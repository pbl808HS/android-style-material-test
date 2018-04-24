package com.dpc.pbl.dualprogramerscode.Models;

public class RecordL {
    private String id;
    private String direccion;
    private String fecha;
    private String hora;
    private String tipo;
    private Boolean existeFb;

    public RecordL(String id, String direccion, String fecha, String hora, String tipo, Boolean existeFb) {
        this.id = id;
        this.direccion = direccion;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
        this.existeFb = existeFb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getExisteFb() {
        return existeFb;
    }

    public void setExisteFb(Boolean existeFb) {
        this.existeFb = existeFb;
    }
}
