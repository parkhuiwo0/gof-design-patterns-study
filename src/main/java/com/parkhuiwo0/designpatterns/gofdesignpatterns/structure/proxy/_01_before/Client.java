package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.proxy._01_before;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
