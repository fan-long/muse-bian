/*A communication notifying or reporting a change in position or circumstance of mutual interest

Examples:
notification of an overdue payment
notification of a coming due date
notification of a change in lifecycle status of a product agreement.
notification of acceptance or rejection of a product offer.*/
package org.museframework.bian.classes;

public class Notification {
    /*An identifier that allows to uniquely refer to an instance of a notification.*/
    private Object notificationReference;

    /*The attribute value of Notification Type, specifies the kind of Notification for this occurrence of Notification.

The concept "Notification Type" is A Classification Hierarchy that distinguishes between Notification according to distinguishing characteristics. 

Characteristics can be
·    Medium (letter, SMS, e-mail ...)
·    Content Type (due date notification, overdue notification, price drop notification, ...)
·    Involved Party (bank notification, a customer notification, ...)
·    Urgency (high priority, medium, low)
·    Commercial or legal 
·    etc.
asset position*/
    private String notificationType;

    /**/
    private String notificationContent;

    public void setNotificationReference(Object notificationReference) {
        this.notificationReference = notificationReference;
    }

    public Object getNotificationReference() {
        return notificationReference;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public String getNotificationContent() {
        return notificationContent;
    }
}