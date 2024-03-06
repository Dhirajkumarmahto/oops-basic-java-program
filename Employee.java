public class Employee {
    String name;
    int emp_id;

    Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Employee c1 = new Employee("Dheeraj", 101);
        Employee c2 = new Employee("Niraj", 102);
        System.out.println(c1.name + " " + c1.emp_id);
        System.out.println(c2.name + " " + c2.emp_id);
    }
}
