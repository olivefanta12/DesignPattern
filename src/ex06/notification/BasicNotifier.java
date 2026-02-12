package ex06.notification;

//속옷
public class BasicNotifier implements Notifier {

    private Notifier notifier; // 무엇이든지 has 할수있다.

    public BasicNotifier(){}

    public BasicNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(){
        if (notifier != null) notifier.send();
        System.out.print("기본알림 ");
    }
}
