package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility._01_before.Request;

public class LoggingRequestHandler extends RequestHandler {

  public LoggingRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println("로깅한다.");
    super.handle(request);
  }
}
