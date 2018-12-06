package com.company;

public class Value {
    private int alphabetLegth = 26;
    private int a;
    private int b;

    public Value(){
        a = generate();
        b = (int)(Math.random()*alphabetLegth) + 1;
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
    }

    private int generate(){
        int number = (int)(Math.random()*alphabetLegth);
        while(gcd(number)>1 || number == 0)
            number = (int) (Math.random() * alphabetLegth);

        return number;
    }

    private int gcd(int number){
        int gcd = 1;
        int min = alphabetLegth;
        if (alphabetLegth > number)
            min = number;
        for(int i = 1; i <= min; ++i) {
            if(number % i==0 && alphabetLegth % i==0)
                gcd = i;
        }
        return gcd;
    }
    public int getA() {
        return a;
    }
    public int getB(){
        return b;
    }
}
