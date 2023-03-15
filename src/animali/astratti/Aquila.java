package animali.astratti;

public class Aquila extends Animale{
    @Override
    public void verso() {
        System.out.println("Squack");
    }

    @Override
    public void mangia() {
        System.out.println("Conigli");
    }
}
