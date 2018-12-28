package Observer;

public class TopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("\nsub : "+name+" / Consuming message=> "+topic.getUpdate());
    }

    @Override
    public void setSubject(Subject sub) {
        topic = sub;
    }
}
