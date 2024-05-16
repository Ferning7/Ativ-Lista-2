import java.util.Scanner;

public class ativ_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia: " );
        int dia = sc.nextInt();
        String diaSem = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Dia inválido";

        };
        System.out.println("Dia inserido: "+diaSem);
    }
}
