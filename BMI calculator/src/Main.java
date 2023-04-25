import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BMICalculator BMICalculator = new BMICalculator();
        Patient patient = new Patient();

        System.out.println("=== CALCULADORA IMC ===");
        System.out.println("Digite seu Nome: ");
        patient.name = scan.nextLine();
        System.out.println("Digite seu peso (ex 70,5): ");
        patient.weight = scan.nextDouble();
        System.out.println("Digite sua altura (ex 1,72): ");
        patient.height = scan.nextDouble();

        BMICalculator.calculateBmi(patient);

        Bmi.showResultBmi();
    }
}
