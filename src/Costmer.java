import java.util.ArrayList;

public class Costmer {
    int id;
    String name;
    int cash;

    Costmer(int id, String name, int cash){
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

    public void buy(smartPhone sm){
        System.out.println("Trying to Buy SmartPhone : " + sm);
    }

    public String toString(){
        return name;
    }

}
