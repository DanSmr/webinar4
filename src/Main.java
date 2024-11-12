import skillmea.course.part2.Chapter;
import skillmea.course.part2.Lecture;
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
        Lecture lecture2 = new Lecture("Classes", 15);
        Lecture lecture3 = new Lecture("Methods", 15);


        Chapter chapter = new Chapter("Java basics", lecture1);

        chapter.addLectures(List.of(lecture1, lecture2, lecture3));
        chapter.printInfo();
    }
}

