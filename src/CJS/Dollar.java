package CJS;

public class Dollar extends Coins
{
    static double value = 1.0;
    int amount;

    public Dollar()
    {
        this.amount = 1;
        this.value = this.value;
    }

    public Dollar(int amount)
    {
        this.amount = amount;
        this.value = amount * this.value;
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
        String s = this.getName() +  this.getAmount();
        return s;
    }
}
