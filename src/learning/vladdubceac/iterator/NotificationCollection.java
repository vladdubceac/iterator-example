package learning.vladdubceac.iterator;

public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notifications;

    public NotificationCollection() {
        notifications = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String notificationText) {
        if(numberOfItems<MAX_ITEMS){
            notifications[numberOfItems++]=new Notification(notificationText);
        }else{
            System.err.println("Full");
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}
