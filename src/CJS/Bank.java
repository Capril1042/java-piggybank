package CJS;


import java.util.ArrayList;

public class Bank
{
  double totalValue;
  ArrayList<Coins> content;

    public Bank()
    {
        this.totalValue = totalValue;
        this.content = new ArrayList<Coins>();
    }

    public void deposit(Coins c){
      content.add(c);
      this.totalValue = this.totalValue + (c.getValue());
    }

    public String getTotalValue(){

      String s = "The Piggy Bank holds $" + String.format("%.2f", this.totalValue);
      return s;
    }

    public String getContent(){
      String s = " ";
      for (int i = 0; i < content.size() ; i++)
      {
        s = s + content.get(i).print() + "\n";
      }

      return s;
    }

  @Override
  public String toString()
  {
    return "Bank{" +
            "totalValue=" + totalValue +
            ", content=" + content +
            '}';
  }
}
