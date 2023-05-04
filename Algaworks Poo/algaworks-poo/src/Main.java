public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Luke";
        person1.lastName = "Schiarratt";
        person1.genrer = "Masc";
        person1.age = 32;
        person1.yearOfBirth = 1989;
        person1.cpf = "322.756.878-10";

        person2.name = "Mary";
        person2.lastName = "Godoy";
        person2.genrer = "Fem";
        person2.age = 22;
        person2.yearOfBirth = 2001;
        person2.cpf = "458.963.321-12";


        myCar.color = "White";
        myCar.manufacturer = "Fiat";
        myCar.model = "Punto";
        myCar.yearOfManufacturer = 2022;
        myCar.carOwner = person1;
        myCar.purchasePrice = 62_860;

        yourCar.color = "Black";
        yourCar.manufacturer = "Toyota";
        yourCar.model = "Corolla Cross";
        yourCar.yearOfManufacturer = 2023;
        yourCar.carOwner = person2;
        yourCar.purchasePrice = 191_090;

        myCar.showVehicleData();
        myCar.showDepreciationSummary();

        System.out.println();

        yourCar.showVehicleData();
        yourCar.showDepreciationSummary();


    }
}
