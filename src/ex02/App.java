package ex02;


// DIP : 추상적인것에 의존하라
// OCP : 새로운 코드에는 OPEN, 기존 코드에는 CLOSE
// SOLID : 객체지향원칙 (0, 0)
public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Doorman doorman = new Doorman();
        Mouse mouse = new Mouse();

        doorman.쫓아내(tiger);
    }
}
