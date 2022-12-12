package Courses;

public class Exceptions {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try{
            System.out.println("Nachalo");
            //nums[7] = 10;
            nums[1] = 1 / 0;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Ошибка в превышении предела массива");
        }
          catch (ArithmeticException exc){
              System.out.println("Арифметическая ошибка");
          }

    }
}

// ArrayStoreException - несовместимый тип

//ArrayIndexOutOfBoundsException - попытка обратится за пределы массива

//ClassCastException - недопустимое приведение типов

//IllegalArgumentException - недопустимый параметр при вызове метода

//NegativeArraySizeException - массив отрицательного размера

//NullPointerException - вы обращаетесь к методу или полю объекта по ссылке, которая равна null

//TypeNotPresentException - неизвестный тип, не удается найти определение для типа с указанным именем

//UnsupportedOperationException - операция не поддерживается

//ClassNotFoundException - класс не найден

//InstantiationException - попытка создать объект абстрактного класса или интерфейса

