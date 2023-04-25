public class BMICalculator {

    // criado um metodo do tipo Bmi para retornar um objeto Bmi
    Bmi calculateBmi(Patient patient) {         // Passando o objeto Patient como parâmetro.
        Bmi bmi = new Bmi();                    // instanciado um objeto Bmi e referenciado na variavel bmi do tipo Bmi

        bmi.namePatient = patient.name;
        bmi.weight = patient.weight;
        bmi.height = patient.height;
        bmi.bmiResult = patient.weight / (patient.height * patient.height);

        if (bmi.bmiResult < 18.5) {
            bmi.classification = "MAGREZA";
            bmi.degreeObesity = 0;
        } else if (bmi.bmiResult <= 24.9) {
            bmi.classification = "NORMAL";
            bmi.degreeObesity = 0;
        } else if (bmi.bmiResult <= 29.9) {
            bmi.classification = "SOBREPESO";
            bmi.degreeObesity = 1;
        } else if (bmi.bmiResult <= 39.9) {
            bmi.classification = "OBESIDADE";
            bmi.degreeObesity = 2;
        } else {
            bmi.classification = "OBESIDADE GRAVE";
            bmi.degreeObesity = 3;
        }

        return bmi;
    }

}
