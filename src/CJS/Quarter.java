package CJS;

public class Quarter extends Coins
{
    static double value = 0.25;
    int amount;
    String name;

    public Quarter()
    {
        this.amount = 1;
        this.value = this.value;
    }

    public Quarter(int amount)
    {
        this.amount = amount;
        this.value= this.value * amount;
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
        return "Quarter";
    }

    @Override
    public String print()
    {
        String s = this.amount + " " + this.getName();
        return s;
    }
}
