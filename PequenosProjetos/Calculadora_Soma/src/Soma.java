// Programa que faz a leitura, soma e exibe o resultado do cálculo entre dois numeros. 
import java.util.Scanner;

public class Soma 
{
    //método principal...
    public static void main(String[] args)
    {

        //Cria um objeto Scanner para fazer a leitura da entrada de dados.
        Scanner input = new Scanner(System.in);

        //variaveis responsaveis pelo armazenamento dos valores
        int num1; 
        int num2;
        int soma;

        // solicitação para que o usuario entre com os numeros
        System.out.print("Digíte o primeiro número(inteiro): ");
        num1 = input.nextInt();

        System.out.print("Digíte o segundo número(inteiro): ");
        num2 = input.nextInt();
         
        soma = num1 + num2; // soma entre os números

        System.out.printf("O resultado da soma é: %d\n", soma); //exibe o resultado

    } //fim do método principal.
    
} //fim da classe.
