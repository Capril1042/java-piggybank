package CJS;

public  abstract class Coins
{
    double value;
    int amount;


    public abstract double getValue();
    public abstract String getName();
    public abstract int getAmount();
    public abstract String print();

    public Coins()
    {

    }
    public Coins(int amount){
        this.amount = amount;

    }
}
