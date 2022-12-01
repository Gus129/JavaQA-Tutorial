public class DataTypes {

    protected byte num = 100; // 8 бит информации на эту переменную нум  -128 +127

    public static void main(String[] args) {
        System.out.println("Hello Plebs!!!");

        short num1 = 131; // 16 бит -32768 +32767
        int num2 = 141; // 32 бит -2147483648 +2147483647
        long num3 = 123; // 64 бит -9223372036854775808 до 9223372036854775807

        float num4 = 1.1f; // 32 бит 1.123456 6-7 знаков после запятой
        double num5 = 1.11d; // 64 бит (d можно не писать) 15-знаков точность после запятой

        char sym = '\u2122'; // 16 бит, значок "тм"

        boolean isTrue = false; // 1 бит true;
    }
}
