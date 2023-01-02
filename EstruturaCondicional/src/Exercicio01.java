/* Exercícios obtidos do URI Online Judge: 
www.urionlinejudge.com.br

PROPÓSTA DO EXERCÍCIO:
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/
package EstruturaCondicional;

import java.util.Scanner;
/**
 *
 * @author Lukas
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner para ler os valores.
        
        int num;//variavel que irá armazenar o numero inteiro
        
        System.out.println("Digite um numero: ");//Aqui o programa irá digitar o que está dentro das aspas no terminal
        num = sc.nextInt();//Logo em seguida o programa irá esperar que usuário entre com um valor para o armazenar dentro da var "num".
        
        /* logo abaixo será criada uma estrutura condicional onde serão utilizados operadores de comparação
        para, caso o numero seja maior(>) ou igual(=) a 0, o programa irá digitar no terminal: "NÃO NEGATIVO".
        Se não, se for menor que 0, o programa irá digitar no terminal: "NEGATIVO".
        */
        if (num >= 0){
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}
