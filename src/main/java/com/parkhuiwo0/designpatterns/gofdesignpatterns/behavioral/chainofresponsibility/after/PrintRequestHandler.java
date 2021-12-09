package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility._01_before.Request;

public class PrintRequestHandler extends RequestHandler {

  public PrintRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println(request.getBody());
    super.handle(request);
  }
}
