import java.util.ArrayList;

/**
   A set of coins.
*/
public class CoinSet
{  
	private double temp;
	private boolean paid = false;
   private ArrayList<Coin> set;

   /**
      Constructs a CoinSet object.
   */
   public CoinSet()
   {  
      set = new ArrayList<Coin>();
   }
   
   public int size()
   {
	   return set.size();
   }
   
   public void remove(int p)
   {
	   set.remove(p);
   }
   
   public Coin get(int m)
   {
	   return set.get(m);
   }
   
   public void addCoinToSet(Coin input)
   {
	   set.add(input);
   }
   
   public double getTotal()
   {
	   temp = 0;
	   for(int i = 0; i < set.size(); i++)
	   {
		   temp += (set.get(i).getValue());
	   }
	   return temp;
   }
   
   public boolean takePayment(double price)
   {
	   if (price >= getTotal())
	   {
		   paid = false;
		   return paid;
	   }
	   else 
	   {
		   for(int j = (set.size() - 1); j >= 0 && price > 0; j--)
		   {
			   price = price - (set.get(j).getValue());
			   set.remove(j);
		   }
		   paid = true;
		   return paid;
	   }
   }
}