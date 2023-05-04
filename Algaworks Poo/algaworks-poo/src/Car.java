public class Car {
    String manufacturer;
    String model;
    String color;
    int yearOfManufacturer;
    double purchasePrice;
    Person carOwner;

    void showVehicleData() {
        System.out.printf(
                "Car:\n Modelo: %s%n Ano: %d%n Car Owner: %s%n Valor de Compra: $ %6.2f%n Cor: %s%n",
                model, yearOfManufacturer, carOwner.name, purchasePrice, color
        );
    }

    void showDepreciationSummary() {
        double resaleValueCar = calculateResaleValue();
        int usageTimeYearsCar = calculateUsageTimeInYears();

        System.out.printf(
                "Tempo de uso (Anos): %d%n Valor de revenda: %6.2f%n",
                usageTimeYearsCar, resaleValueCar
        );
    }

    double calculateIpva() {
        return calculateResaleValue() * 0.04;
    }
    int calculateUsageTimeInYears() {
        return 2023 - yearOfManufacturer;
    }
    double calculateResaleValue() {

        int usageTimeInYears = calculateUsageTimeInYears();
        int numberInYearsOfVehicleDepreciation = 20;

        double resaleValue = (purchasePrice / numberInYearsOfVehicleDepreciation) *
                            (numberInYearsOfVehicleDepreciation - usageTimeInYears);

        if (resaleValue < 0) {
            resaleValue = 0;
        }

        return resaleValue;
    }
}
