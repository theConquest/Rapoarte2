package Rapoarte2;

public class CalculatorUtil {           //update diferente, inmultiri etc
  private static double sumaPosuri;
	public static void calculate(double d1, double d2){
		sumaPosuri = d1 + d2;
	}
	public static double getCalculate(){
		return sumaPosuri;
	}
}
