public class Bmi {
    static double weight;
    static double height;
    static double bmiResult;
    static String classification;
    static int degreeObesity;
    static String namePatient;

    static void showResultBmi() {
        System.out.printf(
                "Nome: %s%n Altura: %.2f%n Peso: %.2f%n Seu IMC: %.2f%n Classificação: %s%n Obesidade Grau: %d%n",
                namePatient, height, weight, bmiResult, classification, degreeObesity
        );
    }

}
