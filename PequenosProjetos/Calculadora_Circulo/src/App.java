import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int r;
        Double PI = Math.PI;

        System.out.print("Digite o Raio do Circulo: ");
        r = in.nextInt();

        System.out.printf("O diâmetro do triangulo: %f\n A circunferência é: %f\n A área é: %f", (2 * PI), (2 * PI * r), (PI * PI));

    }
}
