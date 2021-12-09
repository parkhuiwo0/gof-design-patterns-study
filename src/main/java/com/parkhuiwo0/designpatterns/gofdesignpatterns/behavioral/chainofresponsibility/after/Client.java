package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility._01_before.Request;

public class Client {

  private RequestHandler requestHandler;

  Client(RequestHandler requestHandler) {
    this.requestHandler = requestHandler;
  }

  public void doWork() {
    Request request = new Request("요청 메시지입니다.");
    requestHandler.handle(request);
  }

  public static void main(String[] args) {
    RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

    Client client = new Client(chain);

    client.doWork();
  }
}
