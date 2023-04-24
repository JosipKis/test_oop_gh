

public class Robot implements Comparable<Robot> {

    private String name;
    private int id;
    private static int cntID = 10;
    private static final int MINL = 3;
    private static final int MAXL = 15;
    private static final String alph = "abcdefghijklmnoprstuvzxywABCDEFGHIJKLMNOPRSTUVZXYW0123456789";
    private double batteryLevel;
    private boolean status;
    public Robot(){
        this.name = generateName();
        this.id = cntID++;
        this.batteryLevel = 100;
        this.status = false;
    }
    public void discharge(){
        this.batteryLevel = Math.random() * this.batteryLevel;
    }
    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public double getBatteryLevel(){
        return batteryLevel;
    }

    public void setStatus(boolean status){
        this.status = status;
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
        String rep = "";
        if (status){
            rep = String.format("%-15s", batteryLevel);
        }else{
            rep = String.format("%-15s", name);
        }
        return rep;
    }

    @Override
    public int compareTo(Robot o2) {
        if (this.getName().length() > o2.getName().length()){
            return 1;
        }else if(this.getName().length() < o2.getName().length()){
            return -1;
        }else{
            return 0;
        }
    }
}
