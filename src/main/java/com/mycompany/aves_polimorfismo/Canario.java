
package com.mycompany.aves_polimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jeider
 */
public class Canario extends Ave{

   public static final Logger logger = (Logger) LoggerFactory.getLogger(Canario.class);
    public Canario(){
        logger.debug("instancindo un canario");
        this.setTipoSonido( new Canto());
        this.setTipoVuelo( new VueloConAlas());
    }
    }
   
