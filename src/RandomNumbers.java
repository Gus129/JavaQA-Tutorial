import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(); // метод Random - в дефолт джаве вызываем
        int num = random.nextInt(3);  // случайное число от 0 до 3 (не включительно 3)
        //int num = (int)(Math.random()*100); // Math.random = НЕ ЦЕЛОЕ число от 0 до 1, умножаем на сто чтобы округлить и int чтобы преобразовать в целое
        System.out.println(num);
    }
}
