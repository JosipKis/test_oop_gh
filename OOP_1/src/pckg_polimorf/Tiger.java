package pckg_polimorf;

public class Tiger extends Animal{
    @Override
    public void produceSomeSound() {
        System.out.println(getClass().getSimpleName()+ " Roarr- roarr- meow");;
    }

    public void huntPray(){
        System.out.println("Tiger is hunting something...");
    }
}
