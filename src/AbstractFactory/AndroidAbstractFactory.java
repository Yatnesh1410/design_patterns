package AbstractFactory;

public class AndroidAbstractFactory extends EmployeeAbstractFactory {
    @Override
    Employee getEmployee() {
        return new AndroidDeveloper();
    }
}
