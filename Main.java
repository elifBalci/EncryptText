package com.company;

public class Main {


    public static void main(String[] args) {
	   Value value = new Value();
	   Encrypt encrypt = new Encrypt(value.a, value.b);
	   encrypt.read();
	   encrypt.encryptText();
	   encrypt.write();
    }
}
