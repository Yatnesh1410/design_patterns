package Observer.entities;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(String name);
    void notifyAllSubscribers(String videoTitle);

    Integer getNumberOfSubscribers();
}
