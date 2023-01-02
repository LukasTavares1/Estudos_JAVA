package EstruturasRepetitivas;

import java.util.Scanner;

/**
 *
 * @author Lukas
 */
public class Execercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int tipoCombustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        while (tipoCombustivel != 4){
            tipoCombustivel = in.nextInt();
            if(tipoCombustivel == 1){
                System.out.println("Àlcool");
                alcool = alcool + 1;
            }
            else if(tipoCombustivel == 2){
                System.out.println("Gasolina");
                gasolina = gasolina + 1;
            }
            else if(tipoCombustivel == 3){
                System.out.println("Diesel");
                diesel = diesel + 1;
            }
        }
        System.out.printf("MUITO OBIGADO\n Alcool: %d\n Gasolina: %d\n Diesel: %d\n", alcool, gasolina, diesel);
    }
}
