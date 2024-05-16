import java.util.Scanner;
public class ativ_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int X = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        int Y = sc.nextInt();

        System.out.println((X == Y) ? "São iguais" : "São diferentes");

    }
}
