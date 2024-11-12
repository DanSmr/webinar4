import skillmea.course.part2.Chapter;
import skillmea.course.part2.Lecture;
import skillmea.course.part2.Course;
import skillmea.student.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Dan", 33);
        student1.printInfo();

        Student student2 = new Student("Luke", 31);
        student2.printInfo();

        Student student3 = new Student("Lara", 34);
        student3.printInfo();


        Lecture lecture1 = new Lecture("Intro", 15);
        Lecture lecture2 = new Lecture("Data structures", 15);
        Lecture lecture3 = new Lecture("Functional", 15);

        Lecture lecture4 = new Lecture("Intro", 15);
        Lecture lecture5 = new Lecture("Classes", 15);
        Lecture lecture6 = new Lecture("Methods", 15);


        Chapter chapter1 = new Chapter("Java basics");
        Chapter chapter2 = new Chapter("OOP");

        chapter1.addLectures(List.of(lecture1, lecture2, lecture3));
        chapter2.addLectures(List.of(lecture4, lecture5, lecture6));
        //chapter.printInfo();

        Course javaCourse = new Course("Java programming course: ");
        javaCourse.addChapters(List.of(chapter1, chapter2));
        javaCourse.printInfo();
    }
}

