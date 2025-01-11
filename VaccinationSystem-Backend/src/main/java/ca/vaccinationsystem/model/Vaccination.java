/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



// line 29 "model.ump"
// line 100 "model.ump"
public class Vaccination
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vaccination Attributes
  private String vaccineId;
  private String vaccineName;
  private DateTime administeredDate;
  private String administeredLocation;
  private HealthcareProvider childhealthcareProvider;
  private String additionalNotes;
  private boolean isCompleted;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vaccination(String aVaccineId, String aVaccineName, DateTime aAdministeredDate, String aAdministeredLocation, HealthcareProvider aChildhealthcareProvider, String aAdditionalNotes, boolean aIsCompleted)
  {
    vaccineId = aVaccineId;
    vaccineName = aVaccineName;
    administeredDate = aAdministeredDate;
    administeredLocation = aAdministeredLocation;
    childhealthcareProvider = aChildhealthcareProvider;
    additionalNotes = aAdditionalNotes;
    isCompleted = aIsCompleted;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setVaccineId(String aVaccineId)
  {
    boolean wasSet = false;
    vaccineId = aVaccineId;
    wasSet = true;
    return wasSet;
  }

  public boolean setVaccineName(String aVaccineName)
  {
    boolean wasSet = false;
    vaccineName = aVaccineName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAdministeredDate(DateTime aAdministeredDate)
  {
    boolean wasSet = false;
    administeredDate = aAdministeredDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setAdministeredLocation(String aAdministeredLocation)
  {
    boolean wasSet = false;
    administeredLocation = aAdministeredLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setChildhealthcareProvider(HealthcareProvider aChildhealthcareProvider)
  {
    boolean wasSet = false;
    childhealthcareProvider = aChildhealthcareProvider;
    wasSet = true;
    return wasSet;
  }

  public boolean setAdditionalNotes(String aAdditionalNotes)
  {
    boolean wasSet = false;
    additionalNotes = aAdditionalNotes;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsCompleted(boolean aIsCompleted)
  {
    boolean wasSet = false;
    isCompleted = aIsCompleted;
    wasSet = true;
    return wasSet;
  }

  public String getVaccineId()
  {
    return vaccineId;
  }

  public String getVaccineName()
  {
    return vaccineName;
  }

  public DateTime getAdministeredDate()
  {
    return administeredDate;
  }

  public String getAdministeredLocation()
  {
    return administeredLocation;
  }

  public HealthcareProvider getChildhealthcareProvider()
  {
    return childhealthcareProvider;
  }

  public String getAdditionalNotes()
  {
    return additionalNotes;
  }

  public boolean getIsCompleted()
  {
    return isCompleted;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsCompleted()
  {
    return isCompleted;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "vaccineId" + ":" + getVaccineId()+ "," +
            "vaccineName" + ":" + getVaccineName()+ "," +
            "administeredLocation" + ":" + getAdministeredLocation()+ "," +
            "additionalNotes" + ":" + getAdditionalNotes()+ "," +
            "isCompleted" + ":" + getIsCompleted()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "administeredDate" + "=" + (getAdministeredDate() != null ? !getAdministeredDate().equals(this)  ? getAdministeredDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "childhealthcareProvider" + "=" + (getChildhealthcareProvider() != null ? !getChildhealthcareProvider().equals(this)  ? getChildhealthcareProvider().toString().replaceAll("  ","    ") : "this" : "null");
  }
}