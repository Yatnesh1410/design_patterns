package factoryPattern.courses;

import factoryPattern.courses.entities.course.Course;
import factoryPattern.courses.services.CourseFactory;

public class Demo {
    public static void main(String[] args){
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse != null;
        System.out.println("HLD Courses:");
        System.out.println(hldCourse.getModules());
        assert lldCourse != null;
        System.out.println("LLD Courses:");
        System.out.println(lldCourse.getModules());
    }
 }
