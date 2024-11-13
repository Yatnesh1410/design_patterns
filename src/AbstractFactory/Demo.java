package AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidAbstractFactory());
        System.out.println(e1.name() + " " + e1.salary());

        Employee e2 = EmployeeFactory.getEmployee(new WebAbstractFactory());
        System.out.println(e2.name() + " " + e2.salary());
    }
}
