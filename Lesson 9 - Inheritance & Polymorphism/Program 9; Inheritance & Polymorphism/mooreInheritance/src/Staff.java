//SubClass: Staff inherits SuperClass: Employee
public class Staff extends Employee {

    //Declaration
    protected String title;

    public Staff(String name) {
        this(name, "none");
    }

    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    //Getter & Setter Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    //Overrides toString method to Display Class Name and Person's Name
    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}