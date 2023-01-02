
package entidades;

import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe sua altura:");
        p1.setAltura(sc.nextFloat());
        System.out.println("Informe seu peso:");
        p1.setPeso(sc.nextFloat());
        
        System.out.printf("IMC = %.02f", p1.calcularIMC());
    }
}
