public class BMICalculator {

    // criado um metodo do tipo Bmi para retornar um objeto Bmi
    Bmi calculateBmi(Patient patient) {         // Passando o objeto Patient como parâmetro.
        Bmi bmi = new Bmi();                    // instanciado um objeto Bmi e referenciado na variavel bmi do tipo Bmi

        Bmi.namePatient = patient.name;
        Bmi.weight = patient.weight;
        Bmi.height = patient.height;
        Bmi.bmiResult = patient.weight / (patient.height * patient.height);

        if (Bmi.bmiResult < 18.5) {
            Bmi.classification = "MAGREZA";
            Bmi.degreeObesity = 0;
        } else if (Bmi.bmiResult <= 24.9) {
            Bmi.classification = "NORMAL";
            Bmi.degreeObesity = 0;
        } else if (Bmi.bmiResult <= 29.9) {
            Bmi.classification = "SOBREPESO";
            Bmi.degreeObesity = 1;
        } else if (Bmi.bmiResult <= 39.9) {
            Bmi.classification = "OBESIDADE";
            Bmi.degreeObesity = 2;
        } else {
            Bmi.classification = "OBESIDADE GRAVE";
            Bmi.degreeObesity = 3;
        }

        return bmi;
    }

}
