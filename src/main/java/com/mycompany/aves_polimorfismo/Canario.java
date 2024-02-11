
package com.mycompany.aves_polimorfismo;

/**
 *
 * @author Jeider
 */
public class Canario extends Ave{
    @Override
    public void makeSound(){
            System.out.println("Canta");
    }
    
    public void Vuela(){
        System.out.println("Vuela con alas ");
}
}

