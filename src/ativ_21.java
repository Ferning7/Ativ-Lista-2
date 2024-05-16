import java.util.Scanner;

public class ativ_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira aqui o seu salário: ");
        Double salario = sc.nextDouble();

        if (salario <= 645){
            System.out.println("Até 1 salário minimo");
        }
       else if (salario > 645 && salario <= 1935) {
            System.out.println("Até 3 salário mínimo");
        } else if (salario > 1935 && salario <= 3225) {
            System.out.println("Até 5 salários minimos");
        } else {
            System.out.println("Acima de 5 salários minimos");
        }
    }
}
