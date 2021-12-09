package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility._01_before;

public class LoggingRequestHandler extends RequestHandler {

    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}
