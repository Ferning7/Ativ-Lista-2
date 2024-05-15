import java.util.Scanner;

public class ativ_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite seu endereço: ");
        String end = sc.next();
        System.out.println("Digite seu telefone: ");
        int num = sc.nextInt();

        System.out.println(" ");
        System.out.printf("Nome: %s / Telefone %d / Endereço %s ", nome, num, end);
    }
}
