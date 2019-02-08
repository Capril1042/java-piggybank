package CJS;

public class Dollar extends Coins
{
    static double value = 1.00;
    int amount;

    public Dollar()
    {
        this.amount = 1;
        this.value = 1;
    }

    public Dollar(int amount)
    {
        this.amount = amount;
        this.value = amount * 1.0;
    }

    @Override
    public String getName()
    {
        return "$";
    }

    @Override
    public double getValue()
    {
        return this.value;
    }

    @Override
    public int getAmount()
    {
        return this.amount;
    }

    @Override
    public String print()
    {
        String s = this.getName() +  this.amount;
        return s;
    }
}
