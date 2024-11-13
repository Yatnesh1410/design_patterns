package factoryPattern.courses.entities.course;

import factoryPattern.courses.entities.modules.DemoModule;
import factoryPattern.courses.entities.modules.IntroModule;
import factoryPattern.courses.entities.modules.SummaryModule;

public class HLD extends Course {

    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}
