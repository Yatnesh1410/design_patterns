package factoryPattern.courses.entities.course;

import factoryPattern.courses.entities.modules.ConceptModule;
import factoryPattern.courses.entities.modules.ExerciseModule;
import factoryPattern.courses.entities.modules.IntroModule;
import factoryPattern.courses.entities.modules.SummaryModule;

public class LLD extends Course {
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new SummaryModule());
        modules.add(new ConceptModule());
    }
}
