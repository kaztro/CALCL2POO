package labo_00229017;

import labo_00229017.Operaciones.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "aritmetica":
                return new Aritmetica();
                break;
            case "conversor":
                return ;
                break;
        }
    }
}
