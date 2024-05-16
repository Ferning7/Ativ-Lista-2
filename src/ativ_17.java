import java.util.Scanner;

public class ativ_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu sexo (M - Masculino/ F - Feminino):");
        String sexo = sc.next();
        String F = "Feminino";
        String M = "Masculino";

        System.out.println((sexo.equalsIgnoreCase("F") ? "Bem vinda, linda maravilhosa" : "Koe zé") );
    }
}
