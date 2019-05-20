import java.util.Calendar;

public class Perishable extends Item
{
	private Calendar sellByDate;
  public Perishable(String _name, int _itemNumber, double _price, int _amountInStock, int year, int month, int day)
  {
    super(_name, _itemNumber, _price, _amountInStock);

    sellByDate.set(year, month, day);
  }


  /**
    * getSellByDate method
    * gets the sell by date for a perishable item
    * @return the sell by date for the item
  */
  public Calendar getSellByDate()
  {
    return sellByDate;
  }

}

//good