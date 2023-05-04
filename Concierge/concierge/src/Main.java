import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Visitant visitant1 = new Visitant();
        Visitant visitant2 = new Visitant();

        VisitorRegistration visitant1_Registration = new VisitorRegistration();

        System.out.println("Nome do Visitante: ");
        visitant1.name = scan.next();

        System.out.println("Idade: ");
        visitant1.age = scan.nextInt();

        System.out.println("Digite o tempo de acesso (Em meses): ");
        visitant1.accessTimeInMonths = scan.nextInt();

        System.out.println("Nome do Visitante: ");
        visitant2.name = scan.next();

        System.out.println("Idade: ");
        visitant2.age = scan.nextInt();

        System.out.println("Digite o tempo de acesso (Em meses): ");
        visitant2.accessTimeInMonths = scan.nextInt();

        visitant1_Registration.registration(visitant1, "Católica");
        visitant1_Registration.registration(visitant2);

    }
}
