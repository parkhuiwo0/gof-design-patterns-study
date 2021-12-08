package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.proxy.example;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.proxy.after.DefaultGameService;
import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

  /**
   * Java의 Dynamic Proxy (Reflection의 활용)
   */
    private GameService getGameServiceProxy(com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.proxy.after.GameService target) {
        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("O");
                    method.invoke(target, args);
                    System.out.println("ㅁ");
                    return null;
                });
    }
}
