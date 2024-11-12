package skillmea.course.part2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Chapter> chapters;

    public Course(String name) {
        this.name = name;
        this.chapters = new ArrayList<>();
    }

    public void addChapters(List<Chapter> chapters){
        this.chapters.addAll(chapters);
    }



    public void printInfo() {
        System.out.println("Course: " + name);

        for (Chapter chapter: chapters) {
            System.out.println("-----------------");
            chapter.printInfo();
            System.out.println("-----------------");

        }
    }

}
