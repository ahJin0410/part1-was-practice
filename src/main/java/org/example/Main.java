package org.example;

import java.io.IOException;

// GET /calculate?operand1=11&operator=*&operand2=55 -> 해당 요청 + path + 파라미터3개가 넘어오면 계산 값을 리턴
public class Main {
    public static void main(String[] args) throws IOException {

        new CustomWebApplicationServer(8080).start();
    }
}