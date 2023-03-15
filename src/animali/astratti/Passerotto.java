package animali.astratti;

public class Passerotto extends Animale{
    @Override
    public void mangia() {
        System.out.println("Vermi");
    }

    @Override
    public void verso() {
        System.out.println("Squit");
    }
}
