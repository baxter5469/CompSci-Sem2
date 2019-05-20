import java.util.Calendar;

public class Service extends Product
{
  private boolean needShotRecord;
  private Appointment appointment;
  public Service(String _name, int _itemNumber, double _price, boolean _needShotRecord, Appointment _appointment)
  {
  	super(_name,_itemNumber,_price);
    needShotRecord = _needShotRecord;
    appointment = _appointment;
  }
  
  /**
    * hasShotRecord method
    * checks if the pet has their shot record
    * @param pet being checked
    * @return true if they have it and false if they do not
  */
  public boolean hasShotRecord(Pet _pet)
  {
  	//once pet class is done this needs to be finished***************
    if (shotRecord.length > 0){
      return true;
    }
    else {
      return false;
    }
  }
}