/*
Questão 24:
Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número
*/
package Exercios;
import java.util.Scanner;

public class Exercicio24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char desejaContinuar = 's';
        
        while(desejaContinuar  == 'S' || desejaContinuar  == 's'){
            
            System.out.println("Digite um número:");
            int numero = sc.nextInt();
            
            if(numero == 0){
                System.out.println("Zero");
            }else if(numero > 0){
                System.out.println("Numero maior que zero");
            }else{
                System.out.println("numero menor que zero");
            }
            
            System.out.println("Deseja continuar? 'S' = Sim / 'N' = Não");
            desejaContinuar = sc.next().charAt(0);
        }
    }
}
