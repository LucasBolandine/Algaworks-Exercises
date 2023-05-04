public class BenchmarkTest {

    public static void main(String[] args) {

        Car hr_v = new Car();
        Car corolla = new Car();
        Person amanda = new Person();
        Person john = new Person();

        corolla.carOwner = john;
        hr_v.carOwner = john;

        amanda.name = "Amanda";
        amanda.lastName = "Souza";
        amanda.genrer = "Female";
        amanda.age = 18;
        amanda.yearOfBirth = 2005;

        john.name = "João";
        john.lastName = "Ferreira";
        john.genrer = "Male";
        john.age = 45;
        john.yearOfBirth = 1975;

        corolla.model = "Corolla Cross";
        corolla.color = "Gray";
        corolla.manufacturer = "Toyota";
        corolla.yearOfManufacturer = 2023;

        hr_v.model = "HR-V Turing";
        hr_v.color = "Dark Blue";
        hr_v.manufacturer = "Honda";
        hr_v.yearOfManufacturer = 2019;

        corolla.carOwner.lastName = "do Brás";

        System.out.printf("Proprietario do Corrola:\n %s %s%n ", corolla.carOwner.name, corolla.carOwner.lastName);
        System.out.println();
        System.out.printf("Proprietario do HR-V Turing:\n %s %s%n ", hr_v.carOwner.name, hr_v.carOwner.lastName);

    }


}
