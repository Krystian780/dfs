package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);



        lol(l);

    }


    public static void lol(ArrayList<Integer> x){

        boolean valid2 = true;
        while(valid2) {
            System.out.println("Give number:");
            Scanner s = new Scanner(System.in);
            int number = s.nextInt();
            int index = 0;


            boolean valid = false;
            do {
                if (x.get(index) > number) {
                    if (2 * index + 1 <= x.size()- 1) {
                        if(x.get(2* index +1)==-2) {
                            x.set(2 * index + 1, number);
                            valid = true;
                        }else if(x.get(2 * index +1)!=-2){
                            index = 2 * index + 1;
                        }
                    } else {
                        int w = x.size()-1;
                        int howManyTimes = (2*index+1)-w-1;
                        for(int z = 0; z < howManyTimes; z++){
                            x.add(-2);
                        }
                        x.add(2*index+1, number);
                        valid = true;
                    }
                } else if (x.get(index) < number) {
                    if (2*index+2 <= x.size() - 1) {
                        if(x.get(2* index +1)==-2){
                            x.set(2 * index + 2, number);
                            valid = true;
                        }else if(x.get(2 * index +2)!=-2){
                            index = 2 * index + 2;
                        }
                    } else {
                        add(x,2* index + 2, number);
                        valid = true;
                    }
                }

            } while (!valid);

            for(int j = 0; j < x.size(); j++){
                System.out.println(x.get(j));
            }

            index = 0;

            valid = false;
        }

    }

    public static void add(ArrayList<Integer> x, int index, int last){
        int w = x.size()-1;

        int howManyTimes = index - w - 1;

        for(int z = 0; z < howManyTimes; z++){
            x.add(-2);
        }

        x.add(last);
    }

}
