/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/


import java.util.*;

// line 69 "model.ump"
// line 120 "model.ump"
public class Vaccine
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vaccine Attributes
  private String vaccineId;
  private String name;
  private String details;
  private DateTime recommendedAdministrationDate;
  private String reasonsForPostp1ment;

  //Vaccine Associations
  private List<Clinic> clinics;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vaccine(String aVaccineId, String aName, String aDetails, DateTime aRecommendedAdministrationDate, String aReasonsForPostp1ment)
  {
    vaccineId = aVaccineId;
    name = aName;
    details = aDetails;
    recommendedAdministrationDate = aRecommendedAdministrationDate;
    reasonsForPostp1ment = aReasonsForPostp1ment;
    clinics = new ArrayList<Clinic>();
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

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setDetails(String aDetails)
  {
    boolean wasSet = false;
    details = aDetails;
    wasSet = true;
    return wasSet;
  }

  public boolean setRecommendedAdministrationDate(DateTime aRecommendedAdministrationDate)
  {
    boolean wasSet = false;
    recommendedAdministrationDate = aRecommendedAdministrationDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setReasonsForPostp1ment(String aReasonsForPostp1ment)
  {
    boolean wasSet = false;
    reasonsForPostp1ment = aReasonsForPostp1ment;
    wasSet = true;
    return wasSet;
  }

  public String getVaccineId()
  {
    return vaccineId;
  }

  public String getName()
  {
    return name;
  }

  public String getDetails()
  {
    return details;
  }

  public DateTime getRecommendedAdministrationDate()
  {
    return recommendedAdministrationDate;
  }

  public String getReasonsForPostp1ment()
  {
    return reasonsForPostp1ment;
  }
  /* Code from template association_GetMany */
  public Clinic getClinic(int index)
  {
    Clinic aClinic = clinics.get(index);
    return aClinic;
  }

  public List<Clinic> getClinics()
  {
    List<Clinic> newClinics = Collections.unmodifiableList(clinics);
    return newClinics;
  }

  public int numberOfClinics()
  {
    int number = clinics.size();
    return number;
  }

  public boolean hasClinics()
  {
    boolean has = clinics.size() > 0;
    return has;
  }

  public int indexOfClinic(Clinic aClinic)
  {
    int index = clinics.indexOf(aClinic);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClinics()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addClinic(Clinic aClinic)
  {
    boolean wasAdded = false;
    if (clinics.contains(aClinic)) { return false; }
    clinics.add(aClinic);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeClinic(Clinic aClinic)
  {
    boolean wasRemoved = false;
    if (clinics.contains(aClinic))
    {
      clinics.remove(aClinic);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addClinicAt(Clinic aClinic, int index)
  {  
    boolean wasAdded = false;
    if(addClinic(aClinic))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClinics()) { index = numberOfClinics() - 1; }
      clinics.remove(aClinic);
      clinics.add(index, aClinic);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveClinicAt(Clinic aClinic, int index)
  {
    boolean wasAdded = false;
    if(clinics.contains(aClinic))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClinics()) { index = numberOfClinics() - 1; }
      clinics.remove(aClinic);
      clinics.add(index, aClinic);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addClinicAt(aClinic, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    clinics.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "vaccineId" + ":" + getVaccineId()+ "," +
            "name" + ":" + getName()+ "," +
            "details" + ":" + getDetails()+ "," +
            "reasonsForPostp1ment" + ":" + getReasonsForPostp1ment()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "recommendedAdministrationDate" + "=" + (getRecommendedAdministrationDate() != null ? !getRecommendedAdministrationDate().equals(this)  ? getRecommendedAdministrationDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}