package AbbottTestCasesExpectedTasks.sample;

public enum Color {
    NORMAL("noraml"),
    WARNING("warning"),
    DANGER("danger")
    ;


    private final String colorStr;

    public String getColorStr() {
        return colorStr;
    }

    Color(String colorStr) {
        this.colorStr = colorStr;
    }
}
