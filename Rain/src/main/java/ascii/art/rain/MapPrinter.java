package ascii.art.rain;

public class MapPrinter {
    String[][] map;

    public MapPrinter(String[][] map){
        this.map = map;
    }

    public void print(){
        int y = map.length;
        int x = map[0].length;
        for(int localY=0; localY<y; localY++ ) {
            for (int localX = 0; localX < x; localX++) {
                String column = map[localY][localX];
                if(column == null || column.equals("")){
                    map[localY][localX] = " ";
                }
                System.out.print(map[localY][localX]);
            }
            System.out.println();
        }
    }
}
