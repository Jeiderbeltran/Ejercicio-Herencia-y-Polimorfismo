/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aves_polimorfismo;

import codes.sen.utility.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestCase {
     public static final Logger logger = (Logger) LoggerFactory.getLogger(TestCase.class);
    
     public void canarioTestCase(){
         Canario canario = new Canario();
         Assert.notNull(canario,"");
         logger.debug("Canario realiza Vuelo");
         System.out.println("Canario realiza Vuelo");
         canario.realizarVuelo();
         
         logger.debug("Canario realiza sonido");
         System.out.println("Canario realiza sonido");
         canario.realizarSonido();
         
         logger.debug("Canario cambiando sonido ave");
         canario.setTipoSonido( new Grasnido());
         System.out.println("Canario realizando sonido");
         canario.realizarSonido();
         
        
     }
}