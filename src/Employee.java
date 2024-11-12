public class Employee {
    private String name;
    private String job;
    private String mail;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String job, String mail, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee: Name:" + name + "\n" + "Job:" + job + "\n" + "Email:" + mail + "\n" + "Phone:" + phone + "\n" + "Salary:" + salary + "\n" + "Age:" + age ;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kristina Lyutova", "Trainee", "Lyutova@example.com", "8 000 000 00 00", 10000, 28);
        System.out.println(emp);
    }
}
