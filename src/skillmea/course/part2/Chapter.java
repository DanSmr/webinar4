package skillmea.course.part2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String title;
    private List<Lecture> lectures;

    public Chapter(String title, Lecture lecture) {
        this.title = title;
        this.lectures = new ArrayList<>();
    }

    public void addLectures(List<Lecture> lectures){
        this.lectures.addAll(lectures);
    }

    public void printInfo() {
        System.out.println("Chapter: " + title);
        for (Lecture lecture: this.lectures) {
            lecture.printInfo();
        }
    }
}
