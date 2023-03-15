package animali.astratti;

public class Cane extends Animale{
    @Override
    public void verso() {
        System.out.println("Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Di tutto");
    }

}
