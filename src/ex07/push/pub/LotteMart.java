package ex07.push.pub;

import ex07.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart{

    private String value = null; // 상품
    //임계영역 (여러스레드가 동시에 접근해야할때) -> 레이스 컨디션
    private List<Customer> list = new ArrayList<>(); // 구독자 명단

    @Override
    synchronized public void add(Customer customer) { // 싱크로나이즈 = 레이스 컨디션 막기 위해
        list.add(customer);
    }

    @Override
    public void received() {
        value = "바나나"; // 입고완료
        notify(value);
    }

    @Override
    public void notify(String msg) {
        list.forEach(customer -> {
            // 구독에 따라 다르게 분기해줘야 함
            customer.update(msg); //push
        });
    }

    @Override
    public void remove(Customer customer) {
        list.remove(customer);
    }
}
