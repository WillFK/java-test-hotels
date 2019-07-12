public enum Program {

    REGULAR("Regular"),
    REWARD("Rewards");

    private String name;

    Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Program getProgramByString(String programString) {
        Program[] programs = Program.values();
        for (Program program : programs) {
            if (programString.equals(program.name)) {
                return program;
            }
        }
        throw new IllegalArgumentException();
    }
}
