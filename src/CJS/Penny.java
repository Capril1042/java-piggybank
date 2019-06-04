package CJS;

public class Penny extends Coins
{
    static double value = 0.01;
    int amount;
    String name;

    public Penny()
    {
        this.amount = 1;
   this.value = this.value;
    }

    public Penny(int amount)
    {
        this.amount = amount;
        this.value = amount * value;
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
        return "Penny";
    }

    @Override
    public String print()
    {
        String s = this.amount + " " + this.getName();
        return s;
    }
}
