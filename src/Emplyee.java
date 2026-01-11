import java.util.*;

class LowBalanceException extends Exception{
    LowBalanceException(String msg){
        super(msg);
    }
}

public class Emplyee {
    String name;
    int id;

    Emplyee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void sell(smartPhone sm, Costmer cm, List<smartPhone> a)throws LowBalanceException{
        if(sm.price < cm.cash){
            System.out.println("Phone Sold to costomer : " + cm.name);
            
            cm.cash -= sm.price;
            a.remove(sm);

        }
        else{
            throw new LowBalanceException("You have low balnce Check the EMI Options");
        }
        
    }

    public double EMI(smartPhone sm, List<smartPhone> a){
        System.out.println("Phone sold with below EMI");
        a.remove(sm);
        
        return (sm.price / 12.00);
    }


}
