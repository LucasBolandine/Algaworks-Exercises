public class Main {
    public static void main(String[] args) {
        Airplane emiratesAirplane = new Airplane();

        emiratesAirplane.totalSeats = 200;

        emiratesAirplane.activateAirplane();
        emiratesAirplane.reserveSeats(20);

        System.out.printf(
                "Emirates (%s): %d assentos disponiveis%n",
                emiratesAirplane.active ? "Ativo" : "Inativo",
                emiratesAirplane.calculateVacancySeats()
        );
    }
}
