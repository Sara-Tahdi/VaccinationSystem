/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



// line 46 "model.ump"
// line 110 "model.ump"
public class VaccineRecommendation
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VaccineRecommendation Attributes
  private String vaccineId;
  private String vaccineName;
  private DateTime recommendedDate;
  private DateTime deadlineDate;
  private String clinicLocation;
  private String clinicContact;
  private String vaccineDetails;
  private Clinic nearbyClinics;
  private boolean isUrgent;

  //VaccineRecommendation Associations
  private Clinic clinic;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VaccineRecommendation(String aVaccineId, String aVaccineName, DateTime aRecommendedDate, DateTime aDeadlineDate, String aClinicLocation, String aClinicContact, String aVaccineDetails, Clinic aNearbyClinics, boolean aIsUrgent, Clinic aClinic)
  {
    vaccineId = aVaccineId;
    vaccineName = aVaccineName;
    recommendedDate = aRecommendedDate;
    deadlineDate = aDeadlineDate;
    clinicLocation = aClinicLocation;
    clinicContact = aClinicContact;
    vaccineDetails = aVaccineDetails;
    nearbyClinics = aNearbyClinics;
    isUrgent = aIsUrgent;
    if (!setClinic(aClinic))
    {
      throw new RuntimeException("Unable to create VaccineRecommendation due to aClinic. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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

  public boolean setRecommendedDate(DateTime aRecommendedDate)
  {
    boolean wasSet = false;
    recommendedDate = aRecommendedDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setDeadlineDate(DateTime aDeadlineDate)
  {
    boolean wasSet = false;
    deadlineDate = aDeadlineDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setClinicLocation(String aClinicLocation)
  {
    boolean wasSet = false;
    clinicLocation = aClinicLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setClinicContact(String aClinicContact)
  {
    boolean wasSet = false;
    clinicContact = aClinicContact;
    wasSet = true;
    return wasSet;
  }

  public boolean setVaccineDetails(String aVaccineDetails)
  {
    boolean wasSet = false;
    vaccineDetails = aVaccineDetails;
    wasSet = true;
    return wasSet;
  }

  public boolean setNearbyClinics(Clinic aNearbyClinics)
  {
    boolean wasSet = false;
    nearbyClinics = aNearbyClinics;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsUrgent(boolean aIsUrgent)
  {
    boolean wasSet = false;
    isUrgent = aIsUrgent;
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

  public DateTime getRecommendedDate()
  {
    return recommendedDate;
  }

  public DateTime getDeadlineDate()
  {
    return deadlineDate;
  }

  public String getClinicLocation()
  {
    return clinicLocation;
  }

  public String getClinicContact()
  {
    return clinicContact;
  }

  public String getVaccineDetails()
  {
    return vaccineDetails;
  }

  public Clinic getNearbyClinics()
  {
    return nearbyClinics;
  }

  public boolean getIsUrgent()
  {
    return isUrgent;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsUrgent()
  {
    return isUrgent;
  }
  /* Code from template association_GetOne */
  public Clinic getClinic()
  {
    return clinic;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setClinic(Clinic aNewClinic)
  {
    boolean wasSet = false;
    if (aNewClinic != null)
    {
      clinic = aNewClinic;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    clinic = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "vaccineId" + ":" + getVaccineId()+ "," +
            "vaccineName" + ":" + getVaccineName()+ "," +
            "clinicLocation" + ":" + getClinicLocation()+ "," +
            "clinicContact" + ":" + getClinicContact()+ "," +
            "vaccineDetails" + ":" + getVaccineDetails()+ "," +
            "isUrgent" + ":" + getIsUrgent()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "recommendedDate" + "=" + (getRecommendedDate() != null ? !getRecommendedDate().equals(this)  ? getRecommendedDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "deadlineDate" + "=" + (getDeadlineDate() != null ? !getDeadlineDate().equals(this)  ? getDeadlineDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "nearbyClinics" + "=" + (getNearbyClinics() != null ? !getNearbyClinics().equals(this)  ? getNearbyClinics().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "clinic = "+(getClinic()!=null?Integer.toHexString(System.identityHashCode(getClinic())):"null");
  }
}