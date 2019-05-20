import java.util.ArrayList;
public class Product
{
  private String name;
  private int itemNumber;
  private double price;
  private ArrayList<Product> cart = new ArrayList<Product>();
  
  public Product(String _name, int _itemNumber, double _price)
  {
    name = _name;
    itemNumber = _itemNumber;
  	price = _price;
  }
  
  /**
    * getName method
    * gets the product name
    * @return the name of the product
  */
  public String getName()
  {
    return name;
  }

  /**
    * setName method
    * sets the name of the product
    * @param the name of the product
  */
  public void setName(String _name)
  {
    name = _name;
  }
  
  /**
    * getItemNumber method
    * gets the product item number
    * @return the item number of the product
  */
  public int getItemNumber()
  {
    return itemNumber;
  }

  /**
    * setItemNumber method
    * sets the product item number
    * @param the item number of the product
  */
  public void setItemNumber(int _itemNumber)
  {
    itemNumber = _itemNumber;
  }
  
  /**
    * getPrice method
    * gets the product price
    * @return the price of the product
  */
  public double getPrice()
  {
    return price;
  }

  /**
    * setPrice method
    * sets the product price
    * @param the price of the product
  */
  public void setPrice(double _price)
  {
    price = _price;
  }
  
  /**
    * addToCart method
    * adds product to the cart
    * @param the product number of the product you are adding to the cart
  */
  public void addToCart(Product _product)
  {
    //add product to cart arraylist
    cart.add(_product);
	}
  
   /**
    * getCart method
    * returns the cart as an Arraylist
    * @return the cart Arraylist
  */
  public ArrayList<Product> getCart()
  {
    return cart;
  }
}

//good