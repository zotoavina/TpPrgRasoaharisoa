/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpprgrasoaharisoa.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
@Named(value = "bean2")
@RequestScoped
public class Bean2 {
    
    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants(){
        int nb = 5;
        List<Integer> suivants = new ArrayList<>();
        for(int i = nombre ; i < nombre + nb ; i++){
            suivants.add(i);
        }
        return suivants;
    } 
  
    public String afficher(){
        return "affichage_4?nb=" + nombre + "&;faces-redirect=true";
    }
}
