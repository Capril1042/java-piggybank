package CJS;

public class Main
{
    public static void main(String[] args)
    {

//        Creates collection
        Bank piggyBank = new Bank();
//        piggyBank.add(new Quarter())
        piggyBank.deposit(new Quarter());
//        piggyBank.add(new Dime())
        piggyBank.deposit(new Dime());
//        piggyBank.add(new Dollar(5))
        piggyBank.deposit(new Dollar(5));
//        piggyBank.add(new Nickle(3))
        piggyBank.deposit(new Nickle(3));
//        piggyBank.add(new Dime(7))
        piggyBank.deposit(new Dime(7));
//        piggyBank.add(new Dollar())
        piggyBank.deposit(new Dollar());
//        piggyBank.add(new Penny(10))
        piggyBank.deposit(new Penny(10));
//        Print the contents of the Piggy Bank
        System.out.println(piggyBank.getContent());
//        Print the value of the Piggy Bank
        System.out.println(piggyBank.getTotalValue());
    }
}
