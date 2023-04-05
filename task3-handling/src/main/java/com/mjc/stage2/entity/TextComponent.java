package com.mjc.stage2.entity;

import com.mjc.stage2.parser.AbstractTextParser;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();

    // Write your code here!
    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        StringBuilder result = new StringBuilder();
        for (AbstractTextComponent abstractTextComponent : componentList) {
            result.append(abstractTextComponent.operation());
        }
        return result.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return componentList.size();
    }
}
