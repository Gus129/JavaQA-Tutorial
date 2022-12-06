package Courses;
import Other.Computer;

public class Classes {
    public static void main(String[] args) {
        Computer apple = new Computer(100, 1500, "KekBook"); // объявление (пустого) и использование класса как тип данных
        Computer dell = new Computer(100,1500, "Plebb");
        Computer gus = new Computer();
        //apple.cpu = 4500;
        //dell.cpu = 5500;
        //apple.memory = 16000;
        //apple.name = "PlebBook00";

        //по теории инкапсуляции так делать нельзя (менять переменные класса вне его), поэтому рефакторим

        apple.setMemory(100);
        apple.getMemory();
    }
}
