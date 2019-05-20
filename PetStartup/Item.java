public class Item extends Product
{
	private int amountInStock;
  
  public Item(String _name, int _itemNumber, double _price, int _amountInStock)
  {
  	super(_name,_itemNumber,_price);
    amountInStock = _amountInStock;
  }

  /**
    * getAmountInStock method
    * gets the number of the item left in stock
    * @return the integer amount of the item left in stock
  */
  public int getAmountInStock()
  {
    return amountInStock;
  }

  /**
    * restock method
    * adds more items to stock
    * @param the positive integer amount of the item(s) added to the stock, must be greater than 0 to add to stock
    * @return the integer amount of the item left in stock
  */
  public int restock(int _amountOrdered)
  {
    if (_amountOrdered > 0)
    {
      amountInStock += _amountOrdered;
    }

    return amountInStock;
  }
}

//good