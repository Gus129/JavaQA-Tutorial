public class Cow extends Animal{
    // наследование параметров у другого класса

    public Cow(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);
    }
    //переопределение наследуемого метода
    public String getSay() {
        String say = super.getSay();
        return say + " New!";
    }

    void moo (){
        System.out.println(getSay()+ " во все " + getTeeth() + " зуба ");
    }
}
