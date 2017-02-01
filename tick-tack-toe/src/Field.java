import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by KroL on 01.02.2017.
 */
public class Field {
    static String[] field = {"0", "1", "2",
                             "3", "4", "5",
                             "6", "7", "8"};
    //012, 345, 678, 036, 147, 258, 246, 048

    public void drawField() {
        System.out.println(field[0] + " " + field[1] + " " + field[2]);
        System.out.println(field[3] + " " + field[4] + " " + field[5]);
        System.out.println(field[6] + " " + field[7] + " " + field[8]);
    }

    public boolean isGameEnd() {
        return (((field[0].equals(field[1])) && (field[0].equals(field[2]))) || ((field[3].equals(field[4])) &&
                (field[3].equals(field[5]))) || ((field[6].equals(field[7])) && (field[6].equals(field[8])))
                || ((field[0].equals(field[3])) && (field[0].equals(field[6]))) || ((field[1].equals(field[4])) &&
                (field[1].equals(field[7]))) || ((field[2].equals(field[5])) && (field[2].equals(field[8])))
                || ((field[2].equals(field[4])) && (field[2].equals(field[6]))) || ((field[0].equals(field[4])) &&
                (field[0].equals(field[8]))));
    }

    public void getX() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;
            while (b) {
                int index = Integer.parseInt(reader.readLine());
                if ((index >= 0) && (index <= 8)) {
                    if ((field[index] != "O") && (field[index] != "X")) {
                        field[index] = "X";
                        b = false;
                    }
                    else
                        System.out.println("Введите номер незанятой ячейки");
                }
                else
                    System.out.println("Введите корректные данные");
            }
    }

    public void getO() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;
            while (b) {
                int index = Integer.parseInt(reader.readLine());
                if ((index >= 0) && (index <= 8)) {
                    if ((field[index] != "O") && (field[index] != "X")) {
                        field[index] = "O";
                        b = false;
                    }
                    else
                        System.out.println("Введите номер незанятой ячейки");
                }
                else
                    System.out.println("Введите корректные данные");
            }
    }
}