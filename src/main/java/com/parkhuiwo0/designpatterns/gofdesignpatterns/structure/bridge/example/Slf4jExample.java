package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.bridge.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {
    /**
     * LoggingFacade가 추상화
     * Logger들이 구현체이다.
     * LoggingFacade를 통해서 Logging을 쓸 수 있다.
     *
     * 추상화된 것과 구체적인 것이 분리되어 있는 것으로 본다면, 브릿지 패턴으로 볼 수 있다.
     * 보는 관점에 따라서, 다른 패턴으로 볼 수도 있다.
     *
     * 어떤 라이브러리나 프레임워크에서 Log4j같은 구체적인 로그 프레임워크를 사용한다.
     * 로그가 강제되지 않고, 클라이언트에서 정할 수 있게.
     */
    private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        logger.info("hello logger");
    }
}
