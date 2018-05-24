package labo_00229017.Factory;

import labo_00229017.Conversiones.FactoryBinary;
import labo_00229017.Operaciones.FactoryAritmetica;

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "aritmetica":
                return new FactoryAritmetica();
            case "conversor":
                return new FactoryBinary();
        }
        return null;
    }
}
