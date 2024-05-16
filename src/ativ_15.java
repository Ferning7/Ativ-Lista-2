import java.util.Scanner;

public class ativ_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de X: ");
        int X = sc.nextInt();
        System.out.println("Insira o valor de Y: ");
        int Y = sc.nextInt();

        System.out.println((X > Y) ? "X é o maior" : "Y é o maior");

    }
}
