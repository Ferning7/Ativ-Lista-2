import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um número inteiro: ");
        int num = sc.nextInt();

        int ant = num - 1;

        System.out.println("O sucessor é: " + ant);

    }
}
