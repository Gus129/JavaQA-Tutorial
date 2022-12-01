public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in); // new - выделение памяти на сканнер джава

        int number = scanner.nextInt(); // сканирование только инт числа (иначе ошибка)

        System.out.println(number);
    }
}
