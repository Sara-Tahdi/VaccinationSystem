/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/


import java.util.*;

// line 2 "model.ump"
// line 135 "model.ump"
public class AppUser
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AppUser Attributes
  private String userId;
  private String username;
  private String password;
  private String email;
  private String phoneNumber;
  private String role;
  private Child childProfile;
  private Notification userNotifications;

  //AppUser Associations
  private List<Child> children;
  private List<Notification> notifications;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AppUser(String aUserId, String aUsername, String aPassword, String aEmail, String aPhoneNumber, String aRole, Child aChildProfile, Notification aUserNotifications)
  {
    userId = aUserId;
    username = aUsername;
    password = aPassword;
    email = aEmail;
    phoneNumber = aPhoneNumber;
    role = aRole;
    childProfile = aChildProfile;
    userNotifications = aUserNotifications;
    children = new ArrayList<Child>();
    notifications = new ArrayList<Notification>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUserId(String aUserId)
  {
    boolean wasSet = false;
    userId = aUserId;
    wasSet = true;
    return wasSet;
  }

  public boolean setUsername(String aUsername)
  {
    boolean wasSet = false;
    username = aUsername;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmail(String aEmail)
  {
    boolean wasSet = false;
    email = aEmail;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setRole(String aRole)
  {
    boolean wasSet = false;
    role = aRole;
    wasSet = true;
    return wasSet;
  }

  public boolean setChildProfile(Child aChildProfile)
  {
    boolean wasSet = false;
    childProfile = aChildProfile;
    wasSet = true;
    return wasSet;
  }

  public boolean setUserNotifications(Notification aUserNotifications)
  {
    boolean wasSet = false;
    userNotifications = aUserNotifications;
    wasSet = true;
    return wasSet;
  }

  public String getUserId()
  {
    return userId;
  }

  public String getUsername()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }

  public String getEmail()
  {
    return email;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getRole()
  {
    return role;
  }

  public Child getChildProfile()
  {
    return childProfile;
  }

  public Notification getUserNotifications()
  {
    return userNotifications;
  }
  /* Code from template association_GetMany */
  public Child getChild(int index)
  {
    Child aChild = children.get(index);
    return aChild;
  }

  public List<Child> getChildren()
  {
    List<Child> newChildren = Collections.unmodifiableList(children);
    return newChildren;
  }

  public int numberOfChildren()
  {
    int number = children.size();
    return number;
  }

  public boolean hasChildren()
  {
    boolean has = children.size() > 0;
    return has;
  }

  public int indexOfChild(Child aChild)
  {
    int index = children.indexOf(aChild);
    return index;
  }
  /* Code from template association_GetMany */
  public Notification getNotification(int index)
  {
    Notification aNotification = notifications.get(index);
    return aNotification;
  }

  public List<Notification> getNotifications()
  {
    List<Notification> newNotifications = Collections.unmodifiableList(notifications);
    return newNotifications;
  }

  public int numberOfNotifications()
  {
    int number = notifications.size();
    return number;
  }

  public boolean hasNotifications()
  {
    boolean has = notifications.size() > 0;
    return has;
  }

  public int indexOfNotification(Notification aNotification)
  {
    int index = notifications.indexOf(aNotification);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfChildren()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addChild(Child aChild)
  {
    boolean wasAdded = false;
    if (children.contains(aChild)) { return false; }
    children.add(aChild);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeChild(Child aChild)
  {
    boolean wasRemoved = false;
    if (children.contains(aChild))
    {
      children.remove(aChild);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addChildAt(Child aChild, int index)
  {  
    boolean wasAdded = false;
    if(addChild(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveChildAt(Child aChild, int index)
  {
    boolean wasAdded = false;
    if(children.contains(aChild))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChildren()) { index = numberOfChildren() - 1; }
      children.remove(aChild);
      children.add(index, aChild);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addChildAt(aChild, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfNotifications()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addNotification(Notification aNotification)
  {
    boolean wasAdded = false;
    if (notifications.contains(aNotification)) { return false; }
    notifications.add(aNotification);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeNotification(Notification aNotification)
  {
    boolean wasRemoved = false;
    if (notifications.contains(aNotification))
    {
      notifications.remove(aNotification);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addNotificationAt(Notification aNotification, int index)
  {  
    boolean wasAdded = false;
    if(addNotification(aNotification))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNotifications()) { index = numberOfNotifications() - 1; }
      notifications.remove(aNotification);
      notifications.add(index, aNotification);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveNotificationAt(Notification aNotification, int index)
  {
    boolean wasAdded = false;
    if(notifications.contains(aNotification))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfNotifications()) { index = numberOfNotifications() - 1; }
      notifications.remove(aNotification);
      notifications.add(index, aNotification);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addNotificationAt(aNotification, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    children.clear();
    notifications.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "userId" + ":" + getUserId()+ "," +
            "username" + ":" + getUsername()+ "," +
            "password" + ":" + getPassword()+ "," +
            "email" + ":" + getEmail()+ "," +
            "phoneNumber" + ":" + getPhoneNumber()+ "," +
            "role" + ":" + getRole()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "childProfile" + "=" + (getChildProfile() != null ? !getChildProfile().equals(this)  ? getChildProfile().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "userNotifications" + "=" + (getUserNotifications() != null ? !getUserNotifications().equals(this)  ? getUserNotifications().toString().replaceAll("  ","    ") : "this" : "null");
  }
}