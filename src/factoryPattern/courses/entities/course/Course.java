package factoryPattern.courses.entities.course;

import factoryPattern.courses.entities.modules.Module;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<Module> modules = new ArrayList<>();

    public Course(){
        this.createCourse();
    };

    public List<Module> getModules(){
        return modules;
    }

    public abstract void createCourse();

}
