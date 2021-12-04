package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.composite.after;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite에 해당하는 클래스
 */
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream()
                .mapToInt(c -> c.getPrice())
                .sum();
    }
}
