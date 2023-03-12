package learning.vladdubceac.iterator;

public class NotificationIterator implements Iterator {
    // maintains current position of iterator over the array
    int pos = 0;
    private Notification[] notifications;

    // Constructor takes the array of notifications are going to iterate over
    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        if (pos >= notifications.length || notifications[pos] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if (notifications.length > 0 && pos < notifications.length) {
            return notifications[pos++];
        } else {
            return null;
        }
    }
}
