public class smartPhone {

    String ModelName;
    int price;
    String Colour;

    smartPhone(String ModelName, int price, String Colour){
        this. ModelName = ModelName;
        this.price = price;
        this.Colour = Colour;
    }

    public String toString(){
        return ModelName + " " + Colour + " " + price;
    }
}
