package Other;

import Courses.CustomExceptions;

public class App {
    public static void main(String[] args) {
        Worker worker = new Worker("John");
        worker.atWork();

        try {
            worker.work();
        } catch (CustomExceptions e) {
            throw new RuntimeException(e);
        }
    }
}
