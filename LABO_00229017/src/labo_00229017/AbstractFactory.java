package labo_00229017;

import labo_00229017.Conversiones.Conversor;
import labo_00229017.Operaciones.Aritmetica;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Aritmetica  getAritmetica(String type);
    Conversor getConversor(String type);
}
