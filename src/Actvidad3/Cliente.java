/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actvidad3;

import java.util.Date;

/**
 *
 * @author johan
 */
public class Cliente {
    
    private String nombre;
    
    private String email;
   
    private Date fechaAlta;
    
    private String provincia;
    
      public Cliente(String nombre, String email, String provincia,Date fechaAlta) {
        this.nombre = nombre;
        this.email = email;
        this.provincia = provincia;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Email: " + email ;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    
      public String getProvincia() {
        return provincia;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
      
      
}
