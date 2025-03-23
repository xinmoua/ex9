public class CustomPizza {
    private String toppings;
    private double price;
    public CustomPizza(String toppings,double price){
        this.toppings = toppings;
        this.price = price;
    }
    public void setToppings(String toppings){
        this.toppings = toppings;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getToppings(){
        return this.toppings;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return this.toppings + ": €" + this.price;
    }
}
