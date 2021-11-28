package com.parkhuiwo0.designpatterns.gofdesignpatterns.abstarctfactory.example;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class JavaExample {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        /**
         * 구체적으로 DocumentBuilder라는 구체적인 타입이 아니라, 추상적인 타입 기반으로 코딩하면 된다.
         */
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/config.xml"));
        System.out.println(document.getDocumentElement());
    }
}
