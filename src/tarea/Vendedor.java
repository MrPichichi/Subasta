/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.ArrayList;

/**
 *
 * @author FrancsicoGP
 */
public class Vendedor {
    String nombre;
    String login;
    String contraseña;
    ArrayList<Articulo> articulos=new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }
  
}
