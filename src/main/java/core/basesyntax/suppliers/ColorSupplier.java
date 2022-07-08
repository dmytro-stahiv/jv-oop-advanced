package core.basesyntax.suppliers;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public void getColor() {
    }

    public String getRandomColor() {
        int colorIndex = random.nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
