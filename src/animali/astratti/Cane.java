package animali.astratti;

public class Cane extends Animale implements CanSwim{
    @Override
    public void verso() {
        System.out.println("Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Di tutto");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!");
    }
}
