package Other;

public class Computer {
    private int memory; // скрываем переменную из методов извне
    private int cpu;
    private String name;

    //конструктор класса ниже
    public Computer() {}; // конструктор с пустыми данными (чтобы можно было создать класс без данных)
    public Computer(int memory, int cpu, String name){
        this.memory = memory; // упрощение записи кода, this = ЭТА переменная в классе
        this.cpu = cpu;
        this.name = name;
    }



    public void getCpu() {
        System.out.println(cpu);
    }
    public void getMemory(){
        System.out.println(memory);
    }
    public void setMemory(int m){
        memory = m;
    }
}
