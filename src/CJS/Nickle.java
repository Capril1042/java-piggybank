package CJS;

public class Nickle extends Coins
{
    static double value = 0.05;
    int amount;
    String name = "Nickle";

    public Nickle()
    {
        this.value = this.value;
        this.amount = this.amount;
        this.name = this.name;

    }

    public Nickle(int amount)
    {
        this.amount = amount;
        this.value= this.value * amount;
    }

    @Override
    public String getName()
    {
        return "Nickle";
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
        String s = this.amount + " " + this.getName();
        return s;
    }
}
