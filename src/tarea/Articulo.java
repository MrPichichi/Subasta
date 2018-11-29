/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.HashMap;

public class Articulo {
    int iden;
    String valor;
    String nombre;
    String descripcion;
    String[][] pujas = new String[40][];
    
    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void agregarPuja(String comp, String puja){
        this.pujas[pujas.length][0]=comp;
        this.pujas[pujas.length][1]=puja;
    }
    
}
