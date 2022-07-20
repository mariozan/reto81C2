/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Mario
 */
public class Ruta {
    
    private int id;
    private int origen;
    private int destino;
    private int tiempo_estimado;

   

    public Ruta() {
    }

    public Ruta(int id, int origen, int destino, int tiempo_estimado) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.tiempo_estimado = tiempo_estimado;
    }    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the origen
     */
    public int getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(int origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public int getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(int destino) {
        this.destino = destino;
    }

    /**
     * @return the tiempo_estimado
     */
    public int getTiempo_estimado() {
        return tiempo_estimado;
    }

    /**
     * @param tiempo_estimado the tiempo_estimado to set
     */
    public void setTiempo_estimado(int tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }

    /**
     * @param id the id to set
     */
   
}
