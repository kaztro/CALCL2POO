package labo_00229017.Conversiones;

/**
 *
 * @author LN710Q
 */
public class Binario implements Conversor{

    @Override
    public double Convertir(int a) {
        int exp, digito;
        double binario;
        exp=0;
        binario=0;
        while(a!=0){
                digito = a % 2;           
                binario = binario + digito * Math.pow(10, exp);  
                exp++;
                a = a/2;
        }
        return binario;
    }

   
    
}
