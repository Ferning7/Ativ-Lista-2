import java.util.Scanner;

public class ativ_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        System.out.println((x % 2 == 0) ? "O número é par" : "O número é ímpar");


    }
}
