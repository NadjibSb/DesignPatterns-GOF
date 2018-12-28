package Observer;

public class Magasin {
    public static void main(String[] args) {

        Topic topic = new Topic("First Title : ");

        TopicSubscriber sub1 = new TopicSubscriber("Sub1");
        TopicSubscriber sub2 = new TopicSubscriber("Sub2");
        TopicSubscriber sub3 = new TopicSubscriber("Sub3");

        sub1.setSubject(topic);
        sub3.setSubject(topic);
        sub2.setSubject(topic);

        topic.register(sub1);
        topic.register(sub2);
        topic.register(sub3);

        topic.addContent("Observer Pattern");
    }
}
