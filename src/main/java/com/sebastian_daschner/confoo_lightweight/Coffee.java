package com.sebastian_daschner.confoo_lightweight;

import javax.validation.constraints.NotNull;

public class Coffee {

    @NotNull
    private Type type;

    @NotNull
    private Size size;

    @BeanOriginInStock
    private String beanOrigin;

    public Coffee() {
    }

    public Coffee(final Type type, final Size size, final String beanOrigin) {
        this.type = type;
        this.size = size;
        this.beanOrigin = beanOrigin;
    }

    public Type getType() {
        return type;
    }

    public void setType(final Type type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(final Size size) {
        this.size = size;
    }

    public String getBeanOrigin() {
        return beanOrigin;
    }

    public void setBeanOrigin(final String beanOrigin) {
        this.beanOrigin = beanOrigin;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type=" + type +
                ", size=" + size +
                ", beanOrigin='" + beanOrigin + '\'' +
                '}';
    }
}
