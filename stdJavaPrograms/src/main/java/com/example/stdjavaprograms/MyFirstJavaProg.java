package com.example.stdjavaprograms;


public class MyFirstJavaProg {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new BankAccount(2000);
        accounts[1] = new BankAccount(10000);
        System.out.println("Average balance :" + average((Measurable[]) accounts));



        Country[] countries = new Country[2];
        countries[0] = new Country();
        countries[0].setCountry("Uruguay");
        countries[0].setArea(176220);

        countries[1] = new Country("thailand",514000);


        System.out.println("201721589 seojoonhyuk Average area : " + average(countries));


    }

    private static double average(Measurable[] objects) {
        if (objects.length == 0) {return 0;}
        double sum=0;
        for(Measurable obj : objects){
            sum=sum+ obj.getMeasurable();
            }
        return sum / objects.length;
        }






}