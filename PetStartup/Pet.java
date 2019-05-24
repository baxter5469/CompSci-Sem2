public class Pet extends Item
{
	private String[] shotRecord;//contains all shots that the pet has
  private String[] feedRecord;//contains date/time in yyyy/mm/dd hh:mm format
  
  
  public Pet(String _name, int _itemNumber, double _price, int _amountInStock, String[] _shotRecord, int[][] _feedRecord)
  {
  	super(_name, _itemNumber, _price, _amountInStock);
    shotRecord = _shotRecord;
    feedRecord = _feedRecord;
  }
}
