package kirill.enumeration;

public enum DevelopmentTeam {
    JUNIOR_DEV("Kirill"),
    JUNIOR_DEV_2("Dima"),
    JUNIOR_DEV_3("Nikolai"),
    JUNIOR_DEV_4("Segrei"),
    SENIOR_DEV("Oleg"),
    SENIOR_DEV_2("Mihail"),
    SENIOR_DEV_3("Sergei"),
    PAGE_PROOFS("Vyacheslav"),
    QA("Anna"),
    QA_2("Maxim"),
    QA_3("Dima");

    private final String name;

    private DevelopmentTeam(String name) {
        this.name = name;
    }

}
