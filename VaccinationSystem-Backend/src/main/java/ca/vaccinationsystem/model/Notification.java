/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



// line 77 "model.ump"
// line 125 "model.ump"
public class Notification
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum NotificationChannel { EMAIL, SMS }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Notification Attributes
  private String notificationId;
  private String message;
  private DateTime timestamp;
  private NotificationChannel channel;
  private boolean isAcknowledged;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Notification(String aNotificationId, String aMessage, DateTime aTimestamp, NotificationChannel aChannel, boolean aIsAcknowledged)
  {
    notificationId = aNotificationId;
    message = aMessage;
    timestamp = aTimestamp;
    channel = aChannel;
    isAcknowledged = aIsAcknowledged;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNotificationId(String aNotificationId)
  {
    boolean wasSet = false;
    notificationId = aNotificationId;
    wasSet = true;
    return wasSet;
  }

  public boolean setMessage(String aMessage)
  {
    boolean wasSet = false;
    message = aMessage;
    wasSet = true;
    return wasSet;
  }

  public boolean setTimestamp(DateTime aTimestamp)
  {
    boolean wasSet = false;
    timestamp = aTimestamp;
    wasSet = true;
    return wasSet;
  }

  public boolean setChannel(NotificationChannel aChannel)
  {
    boolean wasSet = false;
    channel = aChannel;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAcknowledged(boolean aIsAcknowledged)
  {
    boolean wasSet = false;
    isAcknowledged = aIsAcknowledged;
    wasSet = true;
    return wasSet;
  }

  public String getNotificationId()
  {
    return notificationId;
  }

  public String getMessage()
  {
    return message;
  }

  public DateTime getTimestamp()
  {
    return timestamp;
  }

  public NotificationChannel getChannel()
  {
    return channel;
  }

  public boolean getIsAcknowledged()
  {
    return isAcknowledged;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsAcknowledged()
  {
    return isAcknowledged;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "notificationId" + ":" + getNotificationId()+ "," +
            "message" + ":" + getMessage()+ "," +
            "isAcknowledged" + ":" + getIsAcknowledged()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "timestamp" + "=" + (getTimestamp() != null ? !getTimestamp().equals(this)  ? getTimestamp().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "channel" + "=" + (getChannel() != null ? !getChannel().equals(this)  ? getChannel().toString().replaceAll("  ","    ") : "this" : "null");
  }
}