public class VisitorRegistration {
    void  registration(final Visitant visitant) {
        final int accessTimeInDays = visitant.accessTimeInMonths * 30;

        if (visitant.minimumAgeForVisitant(visitant)) {
            System.out.printf("Cadastro não realizado\nVisitante menor de %d anos%n", Visitant.MINIMUM_AGE_FOR_VISITANT);
        }
        else {
            System.out.printf(
                "Visitante: %s%n cadastrado com sucesso\n Liberado acesso por %d dias%n",
                visitant.name, accessTimeInDays
            );
        }
    }

    void registration(final Visitant visitant, final String religion) {
        String religionName = religion;
        final int accessTimeInDays;

        if (religionName.equalsIgnoreCase(religionName) != religionName.equalsIgnoreCase("Nenhuma")
            && (!visitant.minimumAgeForVisitant(visitant))) {
            accessTimeInDays = Visitant.ACCESS_IN_DAYS_FOR_RELIGIONS;

            System.out.printf(
                    """
                        Visitante: %s%n cadastrado com sucesso
                        Liberado acesso por %d dias
                        Sr. %s pertence ao Grupo %s%n""",
                    visitant.name, accessTimeInDays, visitant.name, religionName
            );
        }
        else if (religionName.equalsIgnoreCase(religionName) != religionName.equalsIgnoreCase("Nenhuma")
                && (visitant.minimumAgeForVisitant(visitant))) {

            System.out.printf("Cadastro não realizado\nVisitante menor de %d anos%n",
                    Visitant.MINIMUM_AGE_FOR_VISITANT
            );
        }
        else {
            accessTimeInDays = visitant.accessTimeInMonths * 30;
            System.out.printf(
                    "Visitante: %s%n cadastrado com sucesso\n Liberado acesso por %d dias%n",
                    visitant.name, accessTimeInDays
            );
        }
    }
}
