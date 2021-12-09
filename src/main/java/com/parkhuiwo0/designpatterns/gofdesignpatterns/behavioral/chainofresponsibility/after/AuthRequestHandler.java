package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility._01_before.Request;

public class AuthRequestHandler extends RequestHandler {

  public AuthRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    /**
     * 아무런 처리도 안하고 bypassing할 수도 있다. (if문으로)
     * 인증이 안 되면, 여기서 요청을 종료해버릴 수도 있다.
     */
    System.out.println("인증한다.");
    super.handle(request);
  }
}
