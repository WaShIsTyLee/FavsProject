package Model.Entity;


public class Game extends Favs {


    private float price;

    public Game(String name, String ID, float price) {
        super(name, ID);
        this.price = price;
    }

    public Game(float price) {
        super ();
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
