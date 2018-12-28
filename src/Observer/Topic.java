package Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
    private String content;
    private List<Observer> subscribers;

    public Topic(String content) {
        this.content = content;
        this.subscribers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer obj) {
        subscribers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        subscribers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer sub : subscribers){
            sub.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.content;
    }

    public void addContent(String text){
        content +=text;
        System.out.println("\nContent modified :");
        notifyObservers();
    }

}
