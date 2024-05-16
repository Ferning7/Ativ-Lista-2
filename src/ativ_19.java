import java.util.Scanner;

public class ativ_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.println((x % 5 == 0) ? "O número " + x + " é múltiplo de 5" : "O número " + x + " não é múltiplo de 5");


    }
}
