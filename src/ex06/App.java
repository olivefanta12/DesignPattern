package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.SmsNotifier;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *     {
 *      "sends" : [basic, email],
 *       "msg": "반가워!!"
 *     }
 */
//InputStream in = System.in; // 키보드에 stream만 연결 (10진수로 받아줌)
//InputStreamReader ir = new InputStreamReader(in); // 버퍼(고정된길이)를 만들어주고, 문자화시켜줌
//BufferedReader br = new BufferedReader(ir);
// 정의 : 기존에 있는 클래스(속옷)에 기능을 확장하면서 계속 추가하는 패턴
public class App {
    public static void main(String[] args) {
        // 1번 문제 : sms알림, sms알림, email알림 보내기
        EmailNotifier notifier1 = new EmailNotifier(new SmsNotifier(new SmsNotifier()));
        notifier1.send();
        System.out.println();
        // 2번 문제 : 기본알림, sms알림, email알림 보내기
        EmailNotifier notifier2 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        notifier2.send();
        System.out.println();
        // 3번 문제 : sms알림만 보내기
        new SmsNotifier().send();

    }
}
