/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import org.japo.java.entities.Contacto;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class App {
     public final void launchApp(){
        
         System.out.println("Asociacion Cultural Tim & Fire");
         System.out.println("==============================");
         Contacto m1 = new Contacto("",5);
         System.out.println(m1);
     }
}
