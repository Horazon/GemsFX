package com.dlsc.gemsfx.richtextarea;

public class RTText extends RTTextElement<RTText> {

    private RTText() {
    }

    public static RTText create(String text) {
        return new RTText().withText(text);
    }
}
