package Observer.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Channel implements Subject{
    private List<Observer> subscribers = new ArrayList<>();
    private Map<String, Observer> subscribersHash = new HashMap<>();

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
        subscribersHash.put(observer.getName(), observer);
    }


    @Override
    public void unsubscribe(String name) {
        Observer observerToRemove = null;
        if(subscribersHash.containsKey(name)){
            observerToRemove = subscribersHash.get(name);
        }

        if(observerToRemove != null){
            subscribers.remove(observerToRemove);
        }
    }

    @Override
    public void notifyAllSubscribers(String videoTitle) {
        this.subscribers.forEach(subscriber -> subscriber.getNotified(videoTitle) );
    }

    public Integer getNumberOfSubscribers(){
        return this.subscribers.size();
    }

}
