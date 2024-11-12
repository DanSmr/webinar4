package skillmea.course.part1;

public class Lecture {
    private String title;
    private int duration; // in minutes

    public Lecture(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void printInfo() {
        System.out.println("Lecture: " + this.title + "(" + this.duration);
    }
}
