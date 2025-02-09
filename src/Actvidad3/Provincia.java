/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Actvidad3;

/**
 *
 * @author johan
 */
public enum Provincia {
    Barcelona,
    Malaga,
    Alicante,
    Sevilla,
    Toledo,
    Almeria,
    Girona,
    Madrid;
    
    
      
    @Override
    public String toString() {
        // Para mostrar nombres con espacios y acentos
        switch(this) {
            case Barcelona: return "Barcelona";
            case Malaga: return "Malaga";
            case Alicante: return "Alicante";
            case Sevilla: return "Sevilla";
            case Toledo: return "Toledo";
            case Almeria: return "Almeria";
            case Girona: return "Girona";
            case Madrid: return "Madrid";
            default: return "Otra provincia";
        }
    }
    
}
