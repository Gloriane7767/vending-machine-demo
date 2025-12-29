package com.gloriane;

public class Cookie extends Product {
    private boolean isSoft;

    public Cookie(boolean isSoft, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.isSoft = isSoft;
    }

    public String getDescription() {
        String texture = isSoft ? "Soft" : "Crunchy";
        return super.toString() + ", Texture: " + texture;
    }
}
