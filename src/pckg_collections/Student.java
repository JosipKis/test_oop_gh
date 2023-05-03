package pckg_collections;

import java.util.concurrent.ThreadLocalRandom;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private static  int cntID = 100;
    private int yearsOnStudyPrograme;
    private static final int MINY = 1;
    private static final int MAXY = 7;

    public Student(String name){
        this.name = name;
        this.id = cntID++;
        this.yearsOnStudyPrograme = ThreadLocalRandom.current().nextInt(MINY, MAXY+1);
    }

    public int getYearsOnStudyPrograme(){
        return this.yearsOnStudyPrograme;
    }

    @Override
    public int compareTo(Student s2) {
        if (this.yearsOnStudyPrograme > s2.getYearsOnStudyPrograme()){
            return 1;
        }else if (this.yearsOnStudyPrograme < s2.getYearsOnStudyPrograme()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", yearsOnStudyPrograme=" + yearsOnStudyPrograme +
                '}';
    }
}
