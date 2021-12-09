package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility._01_before.Request;

public abstract class RequestHandler {

  private RequestHandler nextHandler;

  RequestHandler(RequestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handle(Request request) {
    if (nextHandler != null) {
      nextHandler.handle(request);
    }
  }
}
