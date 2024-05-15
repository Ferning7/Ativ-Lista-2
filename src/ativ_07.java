import java.util.Scanner;

public class ativ_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        int salario = sc.nextInt();
        double reajuste = salario * 0.07;
        double novSal = salario + reajuste;

        System.out.println("O novo salário reajustado é: " + novSal);


    }
}
