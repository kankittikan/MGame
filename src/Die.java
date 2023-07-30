import java.util.Random;

public class Die {
    private static final Random random = new Random();
    private int faceValue;

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = random.nextInt(1, 10);
    }
}
