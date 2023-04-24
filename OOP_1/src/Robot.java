import java.util.Comparator;

public class Robot implements Comparator<Robot> {

    private String name;
    private int id;
    private static int cntID = 10;
    private static final int MINL = 3;
    private static final int MAXL = 15;
    private static final String alph = "abcdefghijklmnoprstuvzxywABCDEFGHIJKLMNOPRSTUVZXYW0123456789";
    public Robot(){
        this.name = generateName();
        this.id = cntID++;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public int compare(Robot t1, Robot t2) {
        if (t1.getName().length() > t2.getName().length()){
            return 1;
        }else if(t1.getName().length() < t2.getName().length()){
            return -1;
        }else{
            return 0;
        }
    }

    private String generateName(){
        String name = "";
        int lng_chars = (int) (Math.random() * (MAXL-MINL)) + MINL;
        for (int k = 0; k < lng_chars; k++) {
            int pos = (int) (Math.random() * (alph.length()) - 1);
            name += alph.charAt(pos);
        }
        return name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
