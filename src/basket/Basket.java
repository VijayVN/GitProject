package basket;

public class Basket {
	private long manufactureNo; 
	   private int qty;
	   Basket(long manufactureNo, int qty){
	      this.manufactureNo= manufactureNo;
	      this.qty = qty;
	   }
	  public long getManufactureNo(){
	      return manufactureNo;}
	  public int getQty(){
	      return qty;
	  } 
	  public void setManufactureNo(long manufactureNo){
	      this.manufactureNo= manufactureNo;
	  }
	   public void setqty(int qty){
	      this.qty = qty;
	  }
	  public String toString(){
	      return "manufactureNo" + manufactureNo + "qty" + qty;
	  }
}