package pckg_collections;


import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class Test2 {

    public static void main(String[] args) {
        Integer[] someArr = new Integer[5];
        someArr[0] = 10;
        someArr[1] = 10;
        someArr[2] = 30;
        someArr[3] = 35;
        someArr[4] = 234;
        List<Integer> lst = Arrays.asList(someArr);
        System.out.println(lst);
        TreeSet<Integer> tSet = new TreeSet<>(lst);
        System.out.println(tSet);
        tSet.add(33);
        System.out.println(tSet);
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("Paško");
        Student s2 = new Student("Lucija");
        Student s3 = new Student("Martina");
        Student s4 = new Student("Vlatko");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
    }
}
