package Courses;

public class Algebra {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int n3 = 7;
        int n4 = 3;
        int n5 = n3++;  //инкремент = n3+1 ПОСЛЕ
        int n6 = n5;
        int n7 = ++n2; //инкремент = n2+1 ДО
        int n8 = n7;
        // декремент = тоже самое, только -1 , синтаксис = "--"

        int result = n1 + n2;
        int result1 = n3 - n4;
        int result2 = n3 * n4;
        int result3 = n3 / n4; //целочисленное
        int result4 = n3 % n4; //по модулю (результат = остаток целочисл. деления)

        if ((n1 == n4 && n3>n4) || n1<n1) {  // "&&" = оператор "и" ,  "||" = оператор "или"
            System.out.println("Результат сравнения равен");
        } else {
            System.out.println("Результат сравнения НЕ равен");
        }
        // еще операторы сравнения: !=  "не равен",  >=  "больше либо равно" <= "меньше либо равно"


        System.out.println("Результат инкремента ПОСЛЕ: " + n6); // +1 добавился только после вывода информации (поэтому резулоьтат = 7, а не 8)
        System.out.println("Результат инкремента ДО: " + n8);
        System.out.println("Результат сложения: " + result);
        System.out.println("Результат вычитания: " + result1);
        System.out.println("Результат умножения: " + result2);
        System.out.println("Результат целочисленного деления: " + result3);
        System.out.println("Результат деления по модулю (остаток от деления): " + result4);

        System.out.println("Результат сложения строк: " + n1 + n2); // разница между матем. сложением и строками
    }
}
