/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class Contacto {

    public static final int MIN = 3;
    public static final int MAX = 10;
    public static final int EDAD_MIN = 18;
    public static final int EDAD_MAX = 180;
    public static final int DEF_EDAD = 18;
    public static final String DEF_NOMBRE = "Aupatú";
    

    private String alias;
    private int Edad;

    public Contacto() {
        alias = DEF_NOMBRE;
        Edad = DEF_EDAD;
    }

    public Contacto(String alias, int Edad) {
        if (!validar(alias)) {
            this.alias = alias;
        } else {
            this.alias = DEF_NOMBRE;
        }
        if (Edad >=EDAD_MIN && Edad <= EDAD_MAX) {
            System.out.println(Edad);
            this.Edad = Edad;
        } else {
            this.Edad = DEF_EDAD;
            System.out.println(this.Edad);
        }
        
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.alias);
        hash = 17 * hash + this.Edad;
        return hash;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s", alias);
    }

    private boolean validar(String alias) {
        return alias.contains(" ") || !(alias.length() >= MIN) || !(alias.length() <= MAX);
    }

}

