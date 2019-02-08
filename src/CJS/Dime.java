package CJS;

public class Dime extends Coins
{
    static double value = 0.10;
    int amount;
    String name;

    public Dime(int amount)
    {
        this.amount = amount;
        this.value = amount * this.value;
    }

    public Dime()
    {
        this.amount = 1;
        this.value = this.value;

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
    public String getName()
    {
        return "Dime";
    }

    @Override
    public String print()
    {
        String s = this.amount + " " + this.getName();
        return s;
    }
}
