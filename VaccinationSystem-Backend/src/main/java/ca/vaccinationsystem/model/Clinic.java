/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



// line 59 "model.ump"
// line 115 "model.ump"
public class Clinic
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Clinic Attributes
  private String clinicId;
  private String name;
  private String address;
  private String contactNumber;
  private Vaccine availableVaccines;
  private String pricingInfo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Clinic(String aClinicId, String aName, String aAddress, String aContactNumber, Vaccine aAvailableVaccines, String aPricingInfo)
  {
    clinicId = aClinicId;
    name = aName;
    address = aAddress;
    contactNumber = aContactNumber;
    availableVaccines = aAvailableVaccines;
    pricingInfo = aPricingInfo;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setClinicId(String aClinicId)
  {
    boolean wasSet = false;
    clinicId = aClinicId;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setContactNumber(String aContactNumber)
  {
    boolean wasSet = false;
    contactNumber = aContactNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setAvailableVaccines(Vaccine aAvailableVaccines)
  {
    boolean wasSet = false;
    availableVaccines = aAvailableVaccines;
    wasSet = true;
    return wasSet;
  }

  public boolean setPricingInfo(String aPricingInfo)
  {
    boolean wasSet = false;
    pricingInfo = aPricingInfo;
    wasSet = true;
    return wasSet;
  }

  public String getClinicId()
  {
    return clinicId;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public String getContactNumber()
  {
    return contactNumber;
  }

  public Vaccine getAvailableVaccines()
  {
    return availableVaccines;
  }

  public String getPricingInfo()
  {
    return pricingInfo;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "clinicId" + ":" + getClinicId()+ "," +
            "name" + ":" + getName()+ "," +
            "address" + ":" + getAddress()+ "," +
            "contactNumber" + ":" + getContactNumber()+ "," +
            "pricingInfo" + ":" + getPricingInfo()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "availableVaccines" + "=" + (getAvailableVaccines() != null ? !getAvailableVaccines().equals(this)  ? getAvailableVaccines().toString().replaceAll("  ","    ") : "this" : "null");
  }
}