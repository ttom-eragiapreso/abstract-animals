package animali.astratti;

public class Aquila extends Animale implements CanFly{
    @Override
    public void verso() {
        System.out.println("Squack");
    }

    @Override
    public void mangia() {
        System.out.println("Conigli");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!");
    }
}
