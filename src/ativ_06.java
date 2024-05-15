import java.util.Scanner;

public class ativ_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        int y = sc.nextInt();

        int resto = x % y;

        System.out.println("O resto da divisão de X por Y é: " + resto);
    }
}
