//fichero Interes.java
/**
 * Clase el interés (I) que produce un capital
 * el cúal  es directamente proporcional al capital inicial (C),
 * al tiempo (t), y a la tasa de interés (i) :
 *  I = C · i · t
 * @author David
 * @version 1.0

*/

public class Interes{
	/*Metodo calcularInter que nos sirve para aplicar 
	 * la formula I=C*I*T
	 * @param capital capital inicial
	 * @param tiempo tiempo de amortizacion
	 * @param tasInteres tasa interes anual
	 * @return interes
	 **/
	 
public static double calcularInter(double tasa,double tiempo,double capital ){
	
   //código para calcular el interes
  double interes=(capital*tiempo*tasa);
   return interes;
   //return interes
   
}
}
