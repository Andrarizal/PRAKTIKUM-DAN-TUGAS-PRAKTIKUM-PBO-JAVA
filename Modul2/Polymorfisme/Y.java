package com.AndraR.Modul2.Polymorfisme;

public class Y extends X {
    @Override
    public void getValue(String Value) {
        super.getValue(Value);
        System.out.println("Value Kelas Y : "+ Value);
    }
}
