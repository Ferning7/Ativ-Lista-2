import java.util.Scanner;

public class ativ_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int X = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        int Y = sc.nextInt();

        int aux = X;
        X = Y;
        Y = aux;


        System.out.println("X = " + X);
        System.out.println("Y = " + Y);

    }
}
