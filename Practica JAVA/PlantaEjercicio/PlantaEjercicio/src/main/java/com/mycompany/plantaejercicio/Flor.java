
package com.mycompany.plantaejercicio;

public abstract class Flor extends Planta{
    
    private String colorPetalos;
    private int cantPetalos;
    private String colorPistili;
    private String variedad;
    private String estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, int cantPetalos, String colorPistili, String variedad, String estacion, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistili = colorPistili;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistili() {
        return colorPistili;
    }

    public void setColorPistili(String colorPistili) {
        this.colorPistili = colorPistili;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    
    
   
    
    @Override
    public void decirLoqueSoy() {
    }
    
}
