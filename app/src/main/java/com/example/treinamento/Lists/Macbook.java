package com.example.treinamento.Lists;

public class Macbook {

    String textProduct;
    int ImageProduct;

    public Macbook(String textProduct, int imageProduct) {
        this.textProduct = textProduct;
        ImageProduct = imageProduct;
    }

    public void setImageProduct(int imageProduct) {
        ImageProduct = imageProduct;
    }

    public void setTextProduct(String textProduct) {
        this.textProduct = textProduct;
    }

    public int getImageProduct() {
        return ImageProduct;
    }

    public String getTextProduct() {
        return textProduct;
    }
}
