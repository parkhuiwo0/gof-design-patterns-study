package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility._01_before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
