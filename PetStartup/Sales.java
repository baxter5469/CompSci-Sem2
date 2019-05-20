public class Main{
    /*public static double bogo(Arraylist cart){
       cart = new ArrayList<String>();
    }*/
    private ArrayList<Product> cart = new ArrayList<Product>();
    public static double bogof(Product itemOnSale, Arraylist<Product> cart){
        /**
      * @param count item in cart
      * @param shoppingCart.getCart()
      * @param check if the cart has more than one of the same item purchased
      * @param 
      * @param if the cart has more than one of the same item then change the price of 1 product in the pair to free
      * @param if the care doesn't have more than one of the same item then do nothing
      * @return discountPrice
      */
      int count = 0;
      int pairs;
      for(i = 0;i < cart.length();i++){
        if(cart[i].getName().equals(itemOnSale.getName())){
          count++;
        }
      }
      if(count <= 1){
        return 0.0;
      }
      else{
        pairs = count/2; 
      }
      return 10.00 * pairs/count; 
  
    } 
}