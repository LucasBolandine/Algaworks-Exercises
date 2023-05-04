public class Airplane {
    boolean active;
    int totalSeats;
    int reservationSeats;

    int calculateVacancySeats() {
        return totalSeats - reservationSeats;
    }

    void reserveSeats(int numberSeats) {
        if (active) {
            reservationSeats += numberSeats;
        }
        else {
            System.out.println("Aeronave desativado! Não foi possivel reservar os assentos.");
        }
    }
    void activateAirplane() {
        active = true;
    }
    void deactivateAirPlane() {
        active = false;
    }

}
