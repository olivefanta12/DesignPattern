package ex06.notification;

public class EmailNotifier implements Notifier{

    private Notifier notifier; // 무엇이든지 has 할수있다.

    public EmailNotifier(){}

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(){
        if (notifier != null) notifier.send();
        System.out.print("이메일알림 ");
    }
}
