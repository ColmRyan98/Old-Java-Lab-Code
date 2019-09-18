import java.util.*;

/**
   A vending machine.
*/
public class VendingMachine
{  
	private int j = 0;
	private int becauseJ = 0;
	private double total = 0;
	private boolean checker = false;
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;
	private ArrayList<Integer> quantities;
   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
	  quantities = new ArrayList<Integer>();
   }
   
   public void addCoin(Coin input)
   {
	   currentCoins.addCoinToSet(input);
   }
   
   public void addProduct(Product thing, int quantity)
   {
	   products.add(thing);
	   quantities.add(quantity);
   }
   
   public void removeProduct(int pos)
   {
	   if (pos < products.size())
	   {
		   products.remove(pos);
		   quantities.remove(pos);
	   }
   }
   
   public Product[] getProductTypes()
   {
	   Product[] temp = new Product[products.size()];
	   return products.toArray(temp);
   }
   
   public double removeMoney()
   {
	   total = coins.getTotal();
	   for(int r = (coins.size() - 1); r >= 0; r--)
	   {
		    coins.remove(r);
	   }
	   return total;
   }
   
   public void buyProduct(Product p)
   {
	   if (products.contains(p) == true)
	   {
		   j = 0;
		   while (j < products.size() && checker == false)
		   {
			   checker = (products.get(j).equals(p));
			   becauseJ = (int)quantities.get(j);
			   if (checker == false)
			   {
					j++;
			   }
		   }
		   if (becauseJ > 0)
		   {
			   checker = currentCoins.takePayment((products.get(j).getPrice()));
			   System.out.println(currentCoins.getTotal());
			   System.out.println(checker);
			   if (checker == true)
			   {
				   quantities.set(j, (becauseJ - 1));
				   for (int m = (currentCoins.size() - 1); m >= 0; m--)
				   {
					   coins.addCoinToSet(currentCoins.get(m));
					   currentCoins.remove(m);
				   }
			   }
			   else
			   {
				   throw new VendingException("Insufficient Funds.");
			   }
		   }
		   else
		   {
			   throw new VendingException("Product is out of stock");
		   }
	   }
	   else 
	   {
		   throw new VendingException("Product doesn't exist.");
	   }
   }
}