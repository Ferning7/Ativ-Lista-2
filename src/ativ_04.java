import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois números inteiros: ");
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        int mult = x * y;

        System.out.println("O resultado de X * Y é:" + mult);


    }
}
