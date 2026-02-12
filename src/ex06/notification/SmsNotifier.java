package ex06.notification;

public class SmsNotifier implements Notifier{

    private Notifier notifier; // 무엇이든지 has 할수있다.

    public SmsNotifier(){}

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(){
        if (notifier != null) notifier.send();
        System.out.print("sms알림 ");
    }
}
