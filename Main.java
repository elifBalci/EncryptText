package com.company;

public class Main {


    public static void main(String[] args) {
	   Value value = new Value();
	   Encrypt encrypt = new Encrypt(value.getA(), value.getB());
	   encrypt.write();
	   System.out.println("test here");
	   System.out.println( encrypt.getOriginalText());
    }
}
