import java.awt.*;
import java.util.Random;

public class MoveMouse {

    public static final int SEGUNDOS = 3000;
    public static final int Y = 400;
    public static final int X = 400;

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robozito = new Robot();
        Random randomico = new Random();
        while (true) {
            robozito.mouseMove(randomico.nextInt(X), randomico.nextInt(Y));
            Thread.sleep(SEGUNDOS);
        }

    }

}
