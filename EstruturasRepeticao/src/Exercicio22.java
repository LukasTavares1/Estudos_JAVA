/*
 Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, a média de preço de custo e do preço de venda;
 */
package Exercios;
import java.util.Scanner;

public class Exercicio22 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nomeProduto;
        double precoVenda;
        double precoCusto;
        double media;
        
        for(int i = 0; i <= 40; i++){
            System.out.println("Informe o nome do Produto:");
            nomeProduto = sc.nextLine();
            
            System.out.println("Informe o preço de custo:");
            precoCusto = sc.nextDouble();
            
            System.out.println("Informe o preço da venda:");
            precoVenda = sc.nextDouble();
            
            media = precoVenda - precoCusto;
            
            System.out.println(nomeProduto);
            System.out.println("Preço de custo: R$"+ precoCusto);
            System.out.println("Preço de venda: R$"+precoVenda);
            if(media > 0){
                System.out.println("R$" + media);
                System.out.println("O produto gerou lucro");
            } else if(media == 0){
                System.out.println("R$"+ media);
                System.out.println("O produto não gerou luco nem prejuízo"); 
            } else {
                System.out.println("R$"+ media);
                System.out.println("O produto gerou prejuízo");
            }
        }
    }
}
