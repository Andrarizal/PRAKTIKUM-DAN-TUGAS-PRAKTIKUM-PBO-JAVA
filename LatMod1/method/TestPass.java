package com.AndraR.LatMod1.method;

public class TestPass {
    int no1, no2;

    public TestPass(int no1, int no2) {
        this.no1 = no1;
        this.no2 = no2;
    }

    //passed by value
    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    //passd by reference
    void calculate(TestPass passsed) {
        passsed.no1 = passsed.no1 * 10;
        passsed.no2 = passsed.no2 / 2;
    }
}
