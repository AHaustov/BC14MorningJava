package day33;

public class MineSweeper {
    public static void main(String[] args) {
        String[][] field = createNewField(10, 10);
        makeBombs(field, 10);//second Input is percent of bombs in field (0-100)
    }

    private static int fieldCount(String[][] arr) {
        int fieldCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                fieldCount++;
            }
        }
        return fieldCount;
    }

    private static void makeBombs(String[][] field, int percent) {
        int fieldCount = fieldCount(field);
        int bombCount = fieldCount * percent / 100;
        String bomb = "*";
        String empty = "-";
        int count = 0;
        while (count <= bombCount) {
            int x = (int) Math.random() * field.length;
            int y = (int) Math.random() * field[x].length;
            if (!(field[x][y] == bomb)) {
                field[x][y] = bomb;
                count++;
            }
        }
    }

    private static String[][] createNewField(int width, int bride) {
        String[][] output = new String[width][bride];
        return output;
    }


}
