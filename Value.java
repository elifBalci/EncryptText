package com.company;

public class Value {
    public int alphabetLegth = 26;
    public int a;
    public int b;

    public void Value(){
        a = generate();
        b = (int)(Math.random()*alphabetLegth) + 1;
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
    }

    public int generate(){
        int number = (int)(Math.random()*alphabetLegth);
        while(number % alphabetLegth != 1 && number != 0)
            number =  (int)(Math.random()*alphabetLegth);

        return number;
    }
}
