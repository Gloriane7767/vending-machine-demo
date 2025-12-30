package com.gloriane;

public class Cookie extends Product {
    private boolean isSoft;

    public Cookie(int id, String name, double price, int quantity, boolean isSoft) {
        super(id, name, price, quantity);
        this.isSoft = isSoft;
    }

    @Override
    public String getDescription() {
        String texture = isSoft ? "Soft" : "Crunchy";
        return super.toString() + ", Texture: " + texture;
    }
}
