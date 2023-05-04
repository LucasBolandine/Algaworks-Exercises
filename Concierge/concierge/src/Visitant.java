public class Visitant {

    static final int MINIMUM_AGE_FOR_VISITANT = 18;
    static final int ACCESS_IN_DAYS_FOR_RELIGIONS = 180;
    String name;
    int age;
    int accessTimeInMonths;

    boolean minimumAgeForVisitant(Visitant visitant) {
        boolean minimumAgeForVisitantes = visitant.age <   MINIMUM_AGE_FOR_VISITANT;
        return minimumAgeForVisitantes;
    }
}
