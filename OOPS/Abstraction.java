package com.dhruvlenka;

abstract class MobilePhone1{
    int Pixel = 22500;
    int tax = 2500;
    String GPModel = "Google Pixel 4a";
    abstract void GPixel();
}

abstract class MobilePhone {
    int iPhone = 41999;
    int tax = 7999;
    String Model = "iPhone 12 Mini";
    abstract void iPh();
}

class GPixel4a extends MobilePhone1{
    void GPixel() {
        System.out.println("Google Pixel Prize = " + Pixel);
        System.out.println("Tax = " + tax);
        System.out.println("Model = " + GPModel);
    }
}
class iPhone extends MobilePhone{
    void iPh() {
        System.out.println("iPhone Prize " + iPhone);
        System.out.println("Tax = " + tax);
        System.out.println("Model = " + Model);
    }

    public static void main(String[] args) {
        MobilePhone iPhMD20 = new iPhone();
        iPhMD20.iPh();
        System.out.println();
        MobilePhone1 googlePixel = new GPixel4a();
        googlePixel.GPixel();
    }
}
