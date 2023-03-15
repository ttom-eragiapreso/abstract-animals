import animali.astratti.Aquila;
import animali.astratti.Cane;
import animali.astratti.Delfino;
import animali.astratti.Passerotto;

public class Main {
    public static void main(String[] args) {
        Delfino delfino = new Delfino();
        delfino.mangia();
        delfino.verso();
        delfino.dormi();

        Aquila aquila = new Aquila();
        aquila.mangia();
        aquila.dormi();
        aquila.verso();

        Passerotto passerotto = new Passerotto();
        passerotto.mangia();
        passerotto.dormi();
        passerotto.verso();

        Cane cane = new Cane();
        cane.mangia();
        cane.dormi();
        cane.verso();


    }
}