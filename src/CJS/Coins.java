package CJS;

public  abstract class Coins
{
    double value;
    int amount;
    String name;

    public abstract double getValue();
    public abstract String getName();
    public abstract int getAmount();
    public abstract String print();

    public Coins()
    {
        this.amount = amount;
        this.value = value;
    }
    public Coins(int amount){
        this.amount = amount;
        this.value = value;
    }
}
