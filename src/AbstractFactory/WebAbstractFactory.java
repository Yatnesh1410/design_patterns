package AbstractFactory;

public class WebAbstractFactory extends EmployeeAbstractFactory {
    @Override
    Employee getEmployee() {
        return new WebDeveloper();
    }
}
