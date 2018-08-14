package com.iuh.se.gamelaymaybay;

/**
 * Created by Student on 8/14/2018.
 */

public class MayBay {
    private String ma;
    private String ten;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public MayBay(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public MayBay() {
    }

    @Override
    public String toString() {
        return "MayBay{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
