package animali.astratti;

public class Delfino extends Animale implements CanSwim{
    @Override
    public void mangia() {
        System.out.println("Altri pesci");
    }

    @Override
    public void verso() {
        System.out.println("Krik");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!");
    }
}
