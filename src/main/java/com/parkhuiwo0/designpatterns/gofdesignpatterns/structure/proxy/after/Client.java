package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.proxy.after;

public class Client {

  public static void main(String[] args) {
    GameService gameService = new GameServiceProxy();
    gameService.startGame();
  }
}
