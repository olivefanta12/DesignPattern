package ex07.polling;

public class App {
    public static void main(String[] args) {
        LotteMart mart = new LotteMart();
        Customer1 cus1 = new Customer1();

        // 1. 마트 입고 준비
        new Thread(() -> { // 10초 대기
            for (int i = 1; i < 11; i++) {
                System.out.println("입고중 ...("+i+")초");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            mart.received();
            System.out.println("입고 완료");
        }).start();
        // 2. 손님이 폴링
        new Thread(() -> {
            cus1.request(mart);
            while (true){ // 3초에 한번씩 상품 확인
                System.out.println("손님1 : 상품 있어?");
                cus1.request(mart);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
