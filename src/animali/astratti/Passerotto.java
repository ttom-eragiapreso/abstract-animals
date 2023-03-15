package animali.astratti;

public class Passerotto extends Animale implements CanFly{
    @Override
    public void mangia() {
        System.out.println("Vermi");
    }

    @Override
    public void verso() {
        System.out.println("Squit");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!");
    }
}
