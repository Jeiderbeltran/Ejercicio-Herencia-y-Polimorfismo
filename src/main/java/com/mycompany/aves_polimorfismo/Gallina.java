/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves_polimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jeider
 */
public class Gallina extends Ave {
    public static final Logger logger = (Logger) LoggerFactory.getLogger(Gallina.class);
    public void Gallina(){
        logger.debug("instancindo una Gallina");
        tipoSonido = new Grasnido();
        tipoVuelo  = new VueloConAlas();
    }
}

