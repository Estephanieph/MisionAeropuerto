package pe.uni.fiis.dirigida.bean;

import java.util.StringTokenizer;

/**
 * Created by Esther on 31/05/2015.
 */
public class Vuelo {
    private String caracteristica;
    private String tipo;
    private String hora;
    private String destino;
    private String idVuelo;
    private String embarque;
    private Integer puerta;
    private String observaciones;


    public String getCaracteristica(String entrada) {
        return entrada;
    }

    public String getTipo(String nacional) {
        return nacional;
    }

    public String getHora(String hora) {
        return hora;
    }

    public String getDestino(String destino) {
        return destino;
    }

    public String getIdVuelo(String b) {
        return b;
    }

    public String getEmbarque(String s) {
        return s;
    }

    public int getPuerta(Integer numero) {
        return numero;
    }

    public String getObservaciones(String retrasado) {
        return retrasado;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    public String getTipo() {
        return tipo;
    }
    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getEmbarque() {
        return embarque;
    }

    public void setEmbarque(String embarque) {
        this.embarque = embarque;
    }

    public Integer getPuerta() {
        return puerta;
    }

    public void setPuerta(Integer puerta) {
        this.puerta = puerta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
