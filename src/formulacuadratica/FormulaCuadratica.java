
package formulacuadratica;

import java.util.Scanner;


public class FormulaCuadratica {

    public static void main(String[] args) {
        double a, b, c, x1, x2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESA LA CANTIDAD DE LAS VARIABLES");
        System.out.println("a");
        a = entrada.nextDouble();
        
        System.out.println("b");
        b= entrada.nextDouble();
        
        System.out.println("c");
        c = entrada.nextDouble();
        
        
         x1= (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        //x1 = (-b+raiz)/2*
         x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
         
        System.out.println(x1);
        System.out.println(x2);
        
        
        
        
    }
    
}
