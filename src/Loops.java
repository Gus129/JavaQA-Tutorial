import java.io.IOException;

public class Loops {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i <  5; i++){
            System.out.println("Итерация " + i);
        }
        for (int f = 0; (char) System.in.read() != 'S'; f++){
            System.out.println("Итерация " + f);  // Будет выполнятся пока не введут "S"
        }
        int count = 0;
        int count1=10;
        while (count < 10){
            //if(count == 5) break;
            //break - Завершение цикла, continue - возвращение в начало loop'a
            count++;
            if(count%2 != 0) continue; //в переменной каунт = четное число
            System.out.println(count);
        }

        do {  // ВСЕГДА выполнится хоть 1 раз, даже если условие не подходит сразу
            System.out.println(count);
            count++;
        }while (count1 < 10);
    }


}
