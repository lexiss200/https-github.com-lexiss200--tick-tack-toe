
/**
 * Created by KroL on 01.02.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Field field = new Field();
        boolean player = false;
        try {
            do {
                player = !player;
                field.drawField();
                System.out.println(player ? "Введите номер ячейки для X" : "Введите номер ячейки для O");
                if (player)
                    field.getX();
                else
                    field.getO();
            }
            while (!field.isGameEnd());
            field.drawField();
            System.out.println("You WIN!!!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
