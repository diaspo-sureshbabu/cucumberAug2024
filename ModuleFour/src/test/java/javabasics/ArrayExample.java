package javabasics;

public class ArrayExample {
    public static void main(String[] args) {
        int [] intArray= {10,20,30,40,50,60,70,80,90}; // index starts from 0
        String [] strArray = {"Ramesh", "Rajesh", "kumar", "ramu"};
        char [] charArray = {'a', 'b', 'c', 'd', 'e'};

        //looping through the integer array intArray
        for (int loop1=0; loop1< intArray.length; loop1++ ) {
            System.out.println(intArray[loop1]);
        }

        //looping through the String array strArray
        for (int loop2=0; loop2< strArray.length;  ) {
            System.out.println(strArray[loop2++]);
        }

        // looping through the character array
        int loop3=0;
        while(loop3 < charArray.length){
            System.out.println(charArray[loop3++]);
        }
    }

}
