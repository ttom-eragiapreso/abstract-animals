package animali.astratti;

public class Delfino extends Animale{
    @Override
    public void mangia() {
        System.out.println("Altri pesci");
    }

    @Override
    public void verso() {
        System.out.println("Krik");
    }
}
