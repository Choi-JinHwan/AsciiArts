package ascii.art.rain;

import java.io.IOException;
import java.util.*;

public class Cloud {

    String[][] map;
    private String trickle = "☆";
    private int x;
    private int y;
    private int waitCount = 0;


    public Cloud(String[][] map) {
        this.map = map;
        this.y = map.length;
        this.x = map[0].length;
    }

    public Cloud(char trickle, String[][] map) {
        this.trickle = String.valueOf(trickle);
        this.x = map.length;
        this.y = map[0].length;
        this.map = map;
    }

    public void rain() throws InterruptedException {
        waitCount++;
        if(waitCount%3 ==0) {
            createTrickle();
        }
        dropTrickle();
    }

    private void dropTrickle() {
        for (int localY = y - 1; localY >= 0; localY--) {
            if (localY == y - 1) {
                map[localY] = createCleanLine();
            } else {
                String[] tmpLine = map[localY];
                map[localY] = createCleanLine();
                map[localY + 1] = tmpLine;
            }
        }
    }

    private String[] createCleanLine() {
        String[] cleanRow = new String[x];
        for (int i = 0; i < x; i++) {
            cleanRow[i] = " ";
        }
        return cleanRow;
    }

    public void createTrickle() {
        int rainAreaLength = x / 6;
        int[] randomRows = getRandomRow(rainAreaLength, x);
        for (int row : randomRows) {
            map[0][row] = trickle;
        }
    }

    public int[] getRandomRow(int count, int max) {
        Random random = new Random();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }

}
