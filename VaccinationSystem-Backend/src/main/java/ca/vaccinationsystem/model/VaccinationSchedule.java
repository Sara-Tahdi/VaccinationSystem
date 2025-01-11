/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



// line 40 "model.ump"
// line 105 "model.ump"
public class VaccinationSchedule
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VaccinationSchedule Attributes
  private VaccineRecommendation recommendations;
  private DateTime lastUpdated;

  //VaccinationSchedule Associations
  private VaccineRecommendation vaccineRecommendation;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VaccinationSchedule(VaccineRecommendation aRecommendations, DateTime aLastUpdated, VaccineRecommendation aVaccineRecommendation)
  {
    recommendations = aRecommendations;
    lastUpdated = aLastUpdated;
    if (!setVaccineRecommendation(aVaccineRecommendation))
    {
      throw new RuntimeException("Unable to create VaccinationSchedule due to aVaccineRecommendation. See https://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRecommendations(VaccineRecommendation aRecommendations)
  {
    boolean wasSet = false;
    recommendations = aRecommendations;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastUpdated(DateTime aLastUpdated)
  {
    boolean wasSet = false;
    lastUpdated = aLastUpdated;
    wasSet = true;
    return wasSet;
  }

  public VaccineRecommendation getRecommendations()
  {
    return recommendations;
  }

  public DateTime getLastUpdated()
  {
    return lastUpdated;
  }
  /* Code from template association_GetOne */
  public VaccineRecommendation getVaccineRecommendation()
  {
    return vaccineRecommendation;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setVaccineRecommendation(VaccineRecommendation aNewVaccineRecommendation)
  {
    boolean wasSet = false;
    if (aNewVaccineRecommendation != null)
    {
      vaccineRecommendation = aNewVaccineRecommendation;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    vaccineRecommendation = null;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "recommendations" + "=" + (getRecommendations() != null ? !getRecommendations().equals(this)  ? getRecommendations().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "lastUpdated" + "=" + (getLastUpdated() != null ? !getLastUpdated().equals(this)  ? getLastUpdated().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "vaccineRecommendation = "+(getVaccineRecommendation()!=null?Integer.toHexString(System.identityHashCode(getVaccineRecommendation())):"null");
  }
}