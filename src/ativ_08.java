import java.util.Scanner;

public class ativ_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em $");

        double dolar = sc.nextDouble();
        double real = dolar * 1.82;

        System.out.println("O valor em R$ é: R$" + real);
    }
}
