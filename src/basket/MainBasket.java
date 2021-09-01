package basket;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MainBasket {
	 public int getHighestBasketQuantity(List<Basket> bas){
		 OptionalInt a = bas.stream().mapToInt(b -> b.getQty()).max();
		return a.getAsInt();}
	  public int getLowestBasketQuantity(List<Basket> bas){
		  OptionalInt a = bas.stream().mapToInt(b -> b.getQty()).min();
		return a.getAsInt();}
	  public List<Integer> rangeOfBaskets(List<Basket> bas, int startingRange, int endingRange){
		  List<Integer> bas2 = bas.stream().map(b -> b.getQty()).collect(Collectors.toList());
				                           
		  return bas2;
		  }
	  public int totalQtyOfAllBaskets(List<Basket> bas){
		  int total = bas.stream().mapToInt(b -> b.getQty()).sum();
		return total;}
	  
	  
	  public static void main(String args[]) {
		  Basket b1 = new Basket(111111,1);
		  Basket b2 = new Basket(222222,3);
		  Basket b3 = new Basket(333333,5);
		  Basket b4 = new Basket(444444,7);
		  Basket b5 = new Basket(555555,9);
		  List<Basket> bas = new ArrayList<>();
		  bas.add(b1);
		  bas.add(b2);
		  bas.add(b3);
		  bas.add(b4);
		  bas.add(b5);
		  
		  MainBasket main =new MainBasket();
		  
		  System.out.println("highest basket quantity is " + main.getHighestBasketQuantity(bas));
		  System.out.println("lowest basket quantity is " + main.getLowestBasketQuantity(bas));
		  System.out.println("range of baskets is " + main.rangeOfBaskets(bas, 0, 5));
		  System.out.println("total quantity of all baskets " + main.totalQtyOfAllBaskets(bas));
	  }

}