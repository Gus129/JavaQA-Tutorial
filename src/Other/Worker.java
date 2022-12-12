package Other;

import Courses.CustomExceptions;

public class Worker {
    String name;
    boolean isAtWork;
    boolean isSober;

    void atWork(){
        isAtWork = true;
    }

    void sober(){
        isSober = true;
    }
//trows - определение использования кастом эксепшена в данном методе
    void work() throws CustomExceptions {
        if (isAtWork && isSober){
            System.out.println("Можно работать");
        } else {
            throw new CustomExceptions("Работник не готов"); // вывод сообщения при совпадении условий эксепшена
        }
    }




    public Worker(String name) {
        this.name = name;
    }
}
