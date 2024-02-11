
package com.mycompany.aves_polimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jeider
 */
public class AvesTruz extends Ave {
  
    public static final Logger logger = (Logger) LoggerFactory.getLogger(AvesTruz.class);
    public AvesTruz(){
        logger.debug("instanciando un  avestruz");
        this.setTipoSonido( new SinCanto());
        this.setTipoVuelo( new SinVuelo());
    }
    }
