
package com.mycompany.aves_polimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jeider
 */
public class AvesTruz extends Ave {
  
    public static final Logger logger = (Logger) LoggerFactory.getLogger(AvesTruz.class);
    public void Avestrus(){
        logger.debug("instanciando un  avestruz");
        tipoSonido = new SinCanto();
        tipoVuelo  = new SinVuelo();
    }
    }
