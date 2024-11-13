package factoryPattern.courses.services;

import factoryPattern.courses.entities.course.Course;
import factoryPattern.courses.entities.course.HLD;
import factoryPattern.courses.entities.course.LLD;

public class CourseFactory {
    public static Course getCourse(String courseType){
        switch(courseType){
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:
                return null;
        }
    }
}
