import java.util.Scanner;

public class ativ_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
       int x = sc.nextInt();
       if (x < 0) {
           System.out.println("O número é negativo.");
       } else {
           System.out.println("O número é positivo.");
       }

    }
}
