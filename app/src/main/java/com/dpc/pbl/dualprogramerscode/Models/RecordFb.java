package com.dpc.pbl.dualprogramerscode.Models;

public class RecordFb {

    private String idRegistro;
    private String idEmpleado;
    private String imeiDevice;
    private String dirRegistro;
    private String fechaRegistro;
    private String latRegistro;
    private String lngRegistro;
    private String tipoRegistro;

    public RecordFb(String idRegistro, String idEmpleado, String imeiDevice, String dirRegistro, String fechaRegistro, String latRegistro, String lngRegistro, String tipoRegistro) {
        this.idRegistro = idRegistro;
        this.idEmpleado = idEmpleado;
        this.imeiDevice = imeiDevice;
        this.dirRegistro = dirRegistro;
        this.fechaRegistro = fechaRegistro;
        this.latRegistro = latRegistro;
        this.lngRegistro = lngRegistro;
        this.tipoRegistro = tipoRegistro;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getImeiDevice() {
        return imeiDevice;
    }

    public void setImeiDevice(String imeiDevice) {
        this.imeiDevice = imeiDevice;
    }

    public String getDirRegistro() {
        return dirRegistro;
    }

    public void setDirRegistro(String dirRegistro) {
        this.dirRegistro = dirRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getLatRegistro() {
        return latRegistro;
    }

    public void setLatRegistro(String latRegistro) {
        this.latRegistro = latRegistro;
    }

    public String getLngRegistro() {
        return lngRegistro;
    }

    public void setLngRegistro(String lngRegistro) {
        this.lngRegistro = lngRegistro;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
}
