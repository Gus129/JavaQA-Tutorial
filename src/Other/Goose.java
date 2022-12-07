package Other;

public class Goose {
    public Head head;

    public Goose() {
        this.head = new Head();
    }

    public void say(){
        System.out.println("Кричит: " + head.voice);
    }

    class Head {
        String voice = "Га-га-га";
    }





}
