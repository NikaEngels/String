package com.company;

public class Main {

    public static void main(String[] args) {

        OurString str1 = new OurString();
       // System.out.println(str1.toString());
        //System.out.println(str1.getLength());
     //   System.out.println(str1.indexOf('d') == -1);



        OurString ch = new OurString(new char[]{'f', 'f', 'd'});
       // System.out.println(ch.indexOf('f') == 0);
      //  System.out.println(str1);
       // System.out.println(str1.getLength());

        OurString str2 = new OurString("Maase");
        OurString str4 = new OurString("Light");
        //System.out.println(str2.indexOf('d') == 0);
        //System.out.println(str2.getLength());
        System.out.println(str2.equals(str4));
        System.out.println(str2.reverse());
        System.out.println(str4.hashCode());
        System.out.println(str2.concat(str4));


        OurString str3 = new OurString(str2);
        //System.out.println(str3.hashCode());
        //System.out.println(str3.indexOf('d') == 0);
        //System.out.println(str2.charAt(5));




    }
}
