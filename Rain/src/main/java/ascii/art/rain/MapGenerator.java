package ascii.art.rain;

public class MapGenerator {
    private int x;
    private int y;

    public MapGenerator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String[][] generate() {
        String[][] map = new String[y][x];
        for (int localY = 0; localY < y; localY++) {
            for (int localX = 0; localX < x; localX++) {
                map[localY][localX] = " ";
            }
        }
        return map;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
