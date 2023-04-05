package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    // Write your code here!
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] array = string.toCharArray();
        for (char ch: array) {
            abstractTextComponent.add(new SymbolLeaf(ch, TextComponentType.SYMBOL));
        }
    }
}