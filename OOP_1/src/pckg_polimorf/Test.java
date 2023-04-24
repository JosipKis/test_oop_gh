package pckg_polimorf;

public class Test {
    public static void main(String[] args) {
        Device smart = new SmartTV();
        smart.powerOnDevice(20);
        smart.powerOnDevice(20, "Petar");
    }
}
