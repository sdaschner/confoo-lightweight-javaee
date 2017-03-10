package com.sebastian_daschner.confoo_lightweight;

public class NewCoffee {

    private String string;

    public NewCoffee(final String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(final String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "NewCoffee{" +
                "string='" + string + '\'' +
                '}';
    }
}
