/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



// line 86 "model.ump"
// line 130 "model.ump"
public class HealthcareProvider
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HealthcareProvider Attributes
  private String providerId;
  private String name;
  private String contactInfo;
  private String location;

  //HealthcareProvider Associations
  private Vaccination vaccination;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HealthcareProvider(String aProviderId, String aName, String aContactInfo, String aLocation, Vaccination aVaccination)
  {
    providerId = aProviderId;
    name = aName;
    contactInfo = aContactInfo;
    location = aLocation;
    if (!setVaccination(aVaccination))
    {
      throw new RuntimeException("Unable to create HealthcareProvider due to aVaccination. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setProviderId(String aProviderId)
  {
    boolean wasSet = false;
    providerId = aProviderId;
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

  public boolean setContactInfo(String aContactInfo)
  {
    boolean wasSet = false;
    contactInfo = aContactInfo;
    wasSet = true;
    return wasSet;
  }

  public boolean setLocation(String aLocation)
  {
    boolean wasSet = false;
    location = aLocation;
    wasSet = true;
    return wasSet;
  }

  public String getProviderId()
  {
    return providerId;
  }

  public String getName()
  {
    return name;
  }

  public String getContactInfo()
  {
    return contactInfo;
  }

  public String getLocation()
  {
    return location;
  }
  /* Code from template association_GetOne */
  public Vaccination getVaccination()
  {
    return vaccination;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setVaccination(Vaccination aNewVaccination)
  {
    boolean wasSet = false;
    if (aNewVaccination != null)
    {
      vaccination = aNewVaccination;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    vaccination = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "providerId" + ":" + getProviderId()+ "," +
            "name" + ":" + getName()+ "," +
            "contactInfo" + ":" + getContactInfo()+ "," +
            "location" + ":" + getLocation()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "vaccination = "+(getVaccination()!=null?Integer.toHexString(System.identityHashCode(getVaccination())):"null");
  }
}