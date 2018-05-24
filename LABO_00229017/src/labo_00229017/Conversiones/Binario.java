package labo_00229017.Conversiones;

/**
 *
 * @author LN710Q
 */
public class Binario implements Conversor {

    @Override
    public String Convertir(int a) {
        String bin = "";
        if (a > 0) {
            while (a > 0) {
                if (a % 2 == 0) {
                    bin = "0" + bin;
                } else {
                    bin = "1" + bin;
                }
                a = (int) a / 2;
            }
        } else if (a == 0) bin = "0";
        else System.out.println("No es valido, intente de nuevo.");
        return bin;
    }
}


   
    

