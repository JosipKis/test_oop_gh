import java.util.ArrayList;
import java.util.Collections;

public class TestRobot {
    public static void main(String[] args) {
//        String test = "skdjasdhadshGSDHJ";
//        System.out.println(test);
//        System.out.println(test.length());
//        System.out.println(test.charAt(3));
//        int pos =(int) (Math.random() * (test.length())-1);
//        System.out.println("Position: "+ pos +" ch: "+ test.charAt(pos));
//        Robot robot1 = new Robot();
//        System.out.println(robot1);
//        Robot robot2 = new Robot();
//        System.out.println(robot2);
//        System.out.println(robot1.compare(robot1, robot2));
        ArrayList<Robot> robots = generateLisOfRobots(7);
        System.out.println(robots);
        Collections.sort(robots);
        System.out.println("Sorted list: ");
        System.out.println(robots);
        Collections.reverse(robots);
        System.out.println("List in reverse order: ");
        System.out.println(robots);
    }

    private static ArrayList<Robot> generateLisOfRobots(int numRobots){
        ArrayList<Robot> robots = new ArrayList<>(numRobots);
        for (int k = 0; k < numRobots; k++){
            robots.add(new Robot());
        }
        return robots;
    }
}
