package pooEx4;

public class Dolar {
    public static double IOF = 0.011;
    public static double dolarParaReal(double montante , double PrecoDolar){
        return montante * PrecoDolar * (1.0 + IOF);

    }
}
