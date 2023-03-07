//SubClass: Faculty inherits SuperClass: Employee
public class Faculty extends Employee {

    //Declarations (Constants)
    public static String LECTURER = "Lecturer";
    public static String ASSISTANT_PROFESSOR = "Assistant Professor";
    public static String ASSOCIATE_PROFESSOR = "Associate Professor";
    public static String PROFESSOR = "Professor";

    protected String officeHours;
    protected String rank;

    public Faculty(String name) {
        this(name, "9-5PM", "Employee");
    }

    public Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //Getter & Setter Methods
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    //Overrides toString method to Display Class Name and Person's Name
    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}