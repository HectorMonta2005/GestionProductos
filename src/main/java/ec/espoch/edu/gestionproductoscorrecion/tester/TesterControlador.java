/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.gestionproductoscorrecion.tester;


import ec.espoch.edu.gestionproductoscorrecion.modelo.Producto;


public class TesterControlador {
    
    public void prueba(Producto objTarea) {
        System.out.println("Titulo: " + objTarea.getTitulo());
        System.out.println("Descripcion: " + objTarea.getDescripcion());
        System.out.println("Estado: " + objTarea.getEstado());
    }
}
