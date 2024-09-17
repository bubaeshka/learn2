package org.example;

public class TestClassA {
    private int a;
    private String b;

    public TestClassA(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "org.example.TestClassA{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
