import java.util.Scanner;

public class ativ_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();
        int diasV = idade * 356;

        System.out.println("Você já viveu: " + diasV + " dias");
    }
}
