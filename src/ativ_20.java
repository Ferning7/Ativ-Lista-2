import javax.swing.*;
import java.util.Scanner;

public class ativ_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        double temp = sc.nextDouble();

        if (temp <= 18){
            System.out.println("Climinha tá frozen.");
        }
        else if (temp > 18 && temp <= 23){
            System.out.println("Clima tá daora.");
        } else if(temp > 23 && temp <= 35){
            System.out.println("Clima tá praiano.");
        } else {
            System.out.println("Clima tá rj.");
        }


    }
}
