import java.util.Scanner;

public class ativ_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1° número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o 2° número: ");
        int n2 = sc.nextInt();

        System.out.println("---------------------");

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcao = sc.nextInt();

        int resultado;
        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("O resultado é: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("O resultado é: " + resultado);
                break;

        }


    }
}
