package animali.astratti;

public abstract class Animale {
    public void dormi(){
        System.out.println("Zzzz");
    }

    public abstract void verso();

    public abstract void mangia();
}
