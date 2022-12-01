import java.io.IOException;

public class ConditionalOperators {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Какую букву я загадал? ");
        System.out.print("попытайтесь ёё угадать: ");

        ch = (char)System.in.read();

        if (ch == answer ) {
            System.out.println("Угадал!");
        }
        else if ( ch > answer){
            System.out.println("Перестарался");
        }
        else {
            System.out.println("Недостарался");
        }
    }
}
