package Oop.Inheritance;

public class TextBox {
    private String text = ""; // field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}