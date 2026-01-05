
package com.mycompany.plantaejercicio;

public class Arbol extends Planta{

    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tippHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoTronco, double radioTronco, String color, String tippHojas, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tippHojas = tippHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTippHojas() {
        return tippHojas;
    }

    public void setTippHojas(String tippHojas) {
        this.tippHojas = tippHojas;
    }
    
    
    
    
    @Override
    public void decirLoqueSoy() {
    }
    
}
