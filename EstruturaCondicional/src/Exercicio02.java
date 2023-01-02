/* Exercícios obtidos do URI Online Judge: 
www.urionlinejudge.com.br

PROPÓSTA DO EXERCÍCIO:
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author Lukas
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);//Scanner para ler os valores.
        
        int num;//variavel que irá armazenar o número inteiro
        
        System.out.println("Digite um numero: ");//Aqui o programa irá digitar o que está dentro das aspas no terminal
        num = sc.nextInt();//Logo em seguida o programa irá esperar que usuário entre com um valor para o armazenar dentro da var "num"
        
        /*
        A estrutura condicional à seguir... irá nos dizer se o numero é PAR ou ÍMPAR.
        Os critérios adotados foram: se o resto da divizão (num % 2) for igual(==) à 0 então o
        programa retorna "PAR", se não, o programa retona "ÍMPAR".
        */
        if (num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
    }
}
