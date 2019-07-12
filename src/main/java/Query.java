import java.util.Date;
import java.util.List;

public class Query {

    private Program program;
    private List<Date> dates;

    public Query() {
    }

    public Query(Program program, List<Date> dates) {
        this.program = program;
        this.dates = dates;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return program.getName() + ": " + dates.toString();
    }
}
