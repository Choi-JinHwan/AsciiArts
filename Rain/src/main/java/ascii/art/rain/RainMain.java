package ascii.art.rain;

import java.io.IOException;

public class RainMain {

    public static void main(String[] args) throws InterruptedException {
        MapGenerator mapGenerator = new MapGenerator(60, 50);
        String[][] map = mapGenerator.generate();
        Cloud cloud = new Cloud(map);
        MapPrinter mapPrinter = new MapPrinter(map);

        while (true) {
            cloud.rain();
            mapPrinter.print();

//            Thread.sleep(1);
            windowsClearConsole();
        }
    }

    private static void windowsClearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
