import java.util.Scanner;

public class ativ_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        int y = sc.nextInt();
        System.out.println("Digite o valor de Z: ");
        int z = sc.nextInt();

        System.out.println((z >= x && x <= y) ? "Está no intervalo" : "Está fora do intervalo");


    }
}
