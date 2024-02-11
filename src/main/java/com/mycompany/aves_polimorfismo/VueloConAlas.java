/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves_polimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author new
 */
public class VueloConAlas implements TipoVuelo {
     public static final Logger logger = (Logger) LoggerFactory.getLogger(VueloConAlas.class);
    
      public void vuelo() {
        logger.debug("Esta Volando aleteando");
        System.out.println("Esta Volando aleteando");
    }  
}
