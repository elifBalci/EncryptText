package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Encrypt {

    private ArrayList<String> originalText = new ArrayList<String>();
    private ArrayList<String> encriptedText = new ArrayList<String>();
    Scanner scanner;
    int a;
    int b;

    public Encrypt(int a, int b) {
        this.a = a;
        this.b = b;
        read();
        encryptText();
    }

    public void encryptText(){
        for (int i=0; i<originalText.size(); i++){
            encriptedText.add(encryptWord(originalText.get(i)));
        }
        printEncryptedext();
    }

    public String encryptWord(String word){

        StringBuilder wordEnc = new StringBuilder();
        for(int i= 0; i< word.length(); i++) {
            int temp;
            if((word.charAt(i)>=65 && word.charAt(i)<= 90)){
                temp = word.charAt(i) - 'A' ;
                temp = ((a*temp + b)%26) + 'A';
                wordEnc.append((char)temp);
            }
            else if(word.charAt(i)>=97 && word.charAt(i)<= 122) {
                temp = word.charAt(i)-'a';
                temp = ((a*temp + b)%26) + 'a';
                wordEnc.append((char) temp);
            }
            else
                wordEnc.append(word.charAt(i));
        }
        return  wordEnc.toString() ;

    }

    //read text files.
    public void read(){
        try {
            scanner = new Scanner(new File("/home/melkor/IdeaProjects/discrete/src/com/company/input1.txt"));
            while(scanner.hasNext()){
                String line = scanner.next();
                System.out.println("line is :"+ line);
                //line = line.replaceAll("[^a-zA-Z0-9]", "");
                //line = line.trim();
                originalText.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
    public void write(){
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("/home/melkor/IdeaProjects/discrete/src/com/company/output1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i = 0; i< encriptedText.size(); i++){
            writer.write(encriptedText.get(i) + " ");
        }
        writer.close();
    }

    public void printOriginalText(){
       for (int i = 0; i< originalText.size(); i++) {
           System.out.println( originalText.get(i));
       }
    }
    public void printEncryptedext(){
        System.out.println("in print");
        for (int i = 0; i< encriptedText.size(); i++) {
            System.out.println( encriptedText.get(i));
        }
    }

    public ArrayList<String> getOriginalText() {
        return originalText;
    }

    public ArrayList<String> getEncriptedText() {
        return encriptedText;
    }

}
