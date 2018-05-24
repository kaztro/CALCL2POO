package labo_00229017.Conversiones;

import labo_00229017.Factory.AbstractFactory;
import labo_00229017.Operaciones.Aritmetica;

public class FactoryBinary implements AbstractFactory {
    @Override
    public Conversor getConversor(String type) {
        switch (type) {
            case "Binario":
                return new Binario();
        }
        return null;
    }

    @Override
    public Aritmetica getAritmetica(String type){
        return null;
    }


}
