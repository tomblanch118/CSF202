import java.time.LocalDate;

public class Job{

    private final String title;
    private final int salary;
    private final LocalDate endDate;

    public Job(String title, int salary, LocalDate endDate){
        this.title = title;
        this.salary = salary;
        this.endDate = endDate;
    }

    public Job(String title, int salary) {
        this(title, salary, null);
    }


    public String getJobTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return String.format("Job: %s ( £%d a year ), end date: %s.", title, salary, endDate==null?"ongoing":endDate.toString());
    }
}
