package com.germany.agenda;

import java.io.Serializable;
import java.util.Date;

public class NotaItem implements Serializable {
    private int imageResource;
    private String actividad;
    private Date fecha;
    private String tipoActividad;


    public NotaItem(int imageResource, String actividad, Date fecha, String tipoActividad) {
        this.imageResource = imageResource;
        this.actividad = actividad;
        this.fecha = fecha;
        this.tipoActividad = tipoActividad;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    @Override
    public String toString() {
        return "NotaItem{" +
                "imageResource=" + imageResource +
                ", actividad='" + actividad + '\'' +
                ", fecha=" + fecha +
                ", tipoActividad='" + tipoActividad + '\'' +
                '}';
    }

    public  String getfechaString(){
        int dia = fecha.getDay() ;
        int mes = fecha.getMonth();
        int anio = fecha.getYear();
        String obtenerFecha = dia+"-"+mes+"-"+anio;
        return   obtenerFecha;
    }
}
