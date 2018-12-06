package com.company;

public class Main {


    public static void main(String[] args) {
	   Value value = new Value();
	   Encrypt encrypt = new Encrypt(value.getA(), value.getB());
	   encrypt.read();
	   encrypt.encryptText();
	   encrypt.write();
    }
}
