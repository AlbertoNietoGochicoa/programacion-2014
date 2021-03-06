/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Trabajo
 */
public class Juguete {
    
    private List<Tienda> jtiendas = new LinkedList<>();
    private List<Comprador> jcompradores = new LinkedList<>();
    
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    @Override
    public String toString() {
        return "Juguete{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the jtiendas
     */
    public List<Tienda> getJtiendas() {
        return jtiendas;
    }

    /**
     * @return the jcompradores
     */
    public List<Comprador> getJcompradores() {
        return jcompradores;
    }
    
}
