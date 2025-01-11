/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/


import java.util.*;

// line 15 "model.ump"
// line 95 "model.ump"
public class Child
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Child Attributes
  private String childId;
  private String name;
  private int age;
  private String contactInfo;
  private String location;
  private HealthcareProvider childHealthcareProvider;
  private Vaccination childVaccinations;
  private VaccinationSchedule childVaccinationSchedule;

  //Child Associations
  private List<Vaccination> vaccinations;
  private VaccinationSchedule vaccinationSchedule;
  private HealthcareProvider healthcareProvider;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Child(String aChildId, String aName, int aAge, String aContactInfo, String aLocation, HealthcareProvider aChildHealthcareProvider, Vaccination aChildVaccinations, VaccinationSchedule aChildVaccinationSchedule, VaccinationSchedule aVaccinationSchedule, HealthcareProvider aHealthcareProvider)
  {
    childId = aChildId;
    name = aName;
    age = aAge;
    contactInfo = aContactInfo;
    location = aLocation;
    childHealthcareProvider = aChildHealthcareProvider;
    childVaccinations = aChildVaccinations;
    childVaccinationSchedule = aChildVaccinationSchedule;
    vaccinations = new ArrayList<Vaccination>();
    if (!setVaccinationSchedule(aVaccinationSchedule))
    {
      throw new RuntimeException("Unable to create Child due to aVaccinationSchedule. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (!setHealthcareProvider(aHealthcareProvider))
    {
      throw new RuntimeException("Unable to create Child due to aHealthcareProvider. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setChildId(String aChildId)
  {
    boolean wasSet = false;
    childId = aChildId;
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

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
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

  public boolean setChildHealthcareProvider(HealthcareProvider aChildHealthcareProvider)
  {
    boolean wasSet = false;
    childHealthcareProvider = aChildHealthcareProvider;
    wasSet = true;
    return wasSet;
  }

  public boolean setChildVaccinations(Vaccination aChildVaccinations)
  {
    boolean wasSet = false;
    childVaccinations = aChildVaccinations;
    wasSet = true;
    return wasSet;
  }

  public boolean setChildVaccinationSchedule(VaccinationSchedule aChildVaccinationSchedule)
  {
    boolean wasSet = false;
    childVaccinationSchedule = aChildVaccinationSchedule;
    wasSet = true;
    return wasSet;
  }

  public String getChildId()
  {
    return childId;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public String getContactInfo()
  {
    return contactInfo;
  }

  public String getLocation()
  {
    return location;
  }

  public HealthcareProvider getChildHealthcareProvider()
  {
    return childHealthcareProvider;
  }

  public Vaccination getChildVaccinations()
  {
    return childVaccinations;
  }

  public VaccinationSchedule getChildVaccinationSchedule()
  {
    return childVaccinationSchedule;
  }
  /* Code from template association_GetMany */
  public Vaccination getVaccination(int index)
  {
    Vaccination aVaccination = vaccinations.get(index);
    return aVaccination;
  }

  public List<Vaccination> getVaccinations()
  {
    List<Vaccination> newVaccinations = Collections.unmodifiableList(vaccinations);
    return newVaccinations;
  }

  public int numberOfVaccinations()
  {
    int number = vaccinations.size();
    return number;
  }

  public boolean hasVaccinations()
  {
    boolean has = vaccinations.size() > 0;
    return has;
  }

  public int indexOfVaccination(Vaccination aVaccination)
  {
    int index = vaccinations.indexOf(aVaccination);
    return index;
  }
  /* Code from template association_GetOne */
  public VaccinationSchedule getVaccinationSchedule()
  {
    return vaccinationSchedule;
  }
  /* Code from template association_GetOne */
  public HealthcareProvider getHealthcareProvider()
  {
    return healthcareProvider;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVaccinations()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addVaccination(Vaccination aVaccination)
  {
    boolean wasAdded = false;
    if (vaccinations.contains(aVaccination)) { return false; }
    vaccinations.add(aVaccination);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeVaccination(Vaccination aVaccination)
  {
    boolean wasRemoved = false;
    if (vaccinations.contains(aVaccination))
    {
      vaccinations.remove(aVaccination);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVaccinationAt(Vaccination aVaccination, int index)
  {  
    boolean wasAdded = false;
    if(addVaccination(aVaccination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVaccinations()) { index = numberOfVaccinations() - 1; }
      vaccinations.remove(aVaccination);
      vaccinations.add(index, aVaccination);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVaccinationAt(Vaccination aVaccination, int index)
  {
    boolean wasAdded = false;
    if(vaccinations.contains(aVaccination))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVaccinations()) { index = numberOfVaccinations() - 1; }
      vaccinations.remove(aVaccination);
      vaccinations.add(index, aVaccination);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVaccinationAt(aVaccination, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setVaccinationSchedule(VaccinationSchedule aNewVaccinationSchedule)
  {
    boolean wasSet = false;
    if (aNewVaccinationSchedule != null)
    {
      vaccinationSchedule = aNewVaccinationSchedule;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setHealthcareProvider(HealthcareProvider aNewHealthcareProvider)
  {
    boolean wasSet = false;
    if (aNewHealthcareProvider != null)
    {
      healthcareProvider = aNewHealthcareProvider;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    vaccinations.clear();
    vaccinationSchedule = null;
    healthcareProvider = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "childId" + ":" + getChildId()+ "," +
            "name" + ":" + getName()+ "," +
            "age" + ":" + getAge()+ "," +
            "contactInfo" + ":" + getContactInfo()+ "," +
            "location" + ":" + getLocation()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "childHealthcareProvider" + "=" + (getChildHealthcareProvider() != null ? !getChildHealthcareProvider().equals(this)  ? getChildHealthcareProvider().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "childVaccinations" + "=" + (getChildVaccinations() != null ? !getChildVaccinations().equals(this)  ? getChildVaccinations().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "childVaccinationSchedule" + "=" + (getChildVaccinationSchedule() != null ? !getChildVaccinationSchedule().equals(this)  ? getChildVaccinationSchedule().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "vaccinationSchedule = "+(getVaccinationSchedule()!=null?Integer.toHexString(System.identityHashCode(getVaccinationSchedule())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "healthcareProvider = "+(getHealthcareProvider()!=null?Integer.toHexString(System.identityHashCode(getHealthcareProvider())):"null");
  }
}