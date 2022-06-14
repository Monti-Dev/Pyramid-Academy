import java.util.Random;

public class Cave {

    public int chooseTreasureCave() {
        Random rand = new Random();
        int treasureCaveNo = rand.nextInt(3);
        return treasureCaveNo;

    }

    public boolean resolveChoice(int choice) {
        int treasureCaveNo = chooseTreasureCave();

        return choice == treasureCaveNo;

    }
}
