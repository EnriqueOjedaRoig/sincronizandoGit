//fichero Interes.java
//leemos desde un Scanner los valores
//capital, tiempo y tasa de  interés
//y mediante el  método calcularInteres de la
//clase  Interes muestra por pantalla el interés
//calculado
import java.util.Scanner;
public class TesInteres{
   public static void main(String[] arg){
        //preparamos el scanner
         double tasa;
         double tiempo;
         double capital;
        Scanner in=new Scanner(System.in);
        
        //lectura de lo datos
        System.out.println("introduce la capital");
        capital=in.nextDouble();
        System.out.println("Introduce el tiempo");
        tiempo=in.nextDouble();
        System.out.println("Introduce la tasa de interes");
        tasa=in.nextDouble();
        //llamada al método calcularInteres
        double interes=Interes.calcularInter(tasa,tiempo,capital);
        //mostramos por pantalla el valor del interés
        System.out.println("El valor del interes es :"+interes);
   }
}
