package org.example.counter;

/**
 * RaceCondition?
 * 여러 프로세스 혹은 쓰레드가 동시에 하나의 자원에 접근하기 위해 경쟁하는 형태로 원하지 않는 결과 값이 나올 수 있음
 */
public class RaceConditionDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
