package com.example.treinamento;

public class DataModel {
    
    private String tittle;
    int imagePhone;

    public DataModel(String tittle, int imagePhone) {
        this.tittle = tittle;
        this.imagePhone = imagePhone;

    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public int getImagePhone() {
        return imagePhone;
    }

    public void setImagePhone(int imagePhone) {
        this.imagePhone = imagePhone;
    }
}
