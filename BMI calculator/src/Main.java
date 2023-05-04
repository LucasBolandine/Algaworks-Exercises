import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int cont = 0;
        int numberPeoplesConsult;

        System.out.println("Digite o número de pessoas que iram consultar o IMC: ");
        numberPeoplesConsult = scan.nextInt();

        while (cont < numberPeoplesConsult) {
            Patient[] patients = new Patient[100];

            for (var i = 0; i < patients.length; i++) {
                patients[i] = new Patient();
                BMICalculator BMICalculatorPatient = new BMICalculator();

                System.out.println("=== CALCULADORA IMC ===");
                System.out.println("Digite seu Nome: ");
                patients[i].name = scan.next();
                System.out.println("Digite seu peso (ex 70,5): ");
                patients[i].weight = scan.nextDouble();
                System.out.println("Digite sua altura (ex 1,72): ");
                patients[i].height = scan.nextDouble();

                BMICalculatorPatient.calculateBmi(patients[i]);

                Bmi.showResultBmi();
                System.out.println();

                cont++;
            }
        }
    }
}
