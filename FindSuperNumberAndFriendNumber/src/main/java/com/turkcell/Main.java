package com.turkcell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int num1 = 220;
            int num2 = 284;

            if(friendNumber(num1,num2)){
                System.out.printf("Verilen %d ve %d sayıları arkadaş sayılardır.%n", num1, num2);
            }
            else {
                System.out.printf("Verilen %d ve %d sayıları arkadaş sayı değillerdir.%n", num1, num2);

            }


        //superNumber();
        }

        public static void superNumber() {
            for (int i = 1; i <= 10000; i++) {
                if (isSuperNumber(i))
                    System.out.println(i);
            }
        }

        public static boolean isSuperNumber(int num) {
            int sum = 0;
            for (int i = 1; i<num;i++){
                if (num %i ==0)
                    sum+=i;
            }
            return sum == num;
        }

        public static boolean friendNumber(int num1, int num2){
        int temp1 =0;
        int temp2 =0;

        for(int i=1; i<num1; i++){
            if(num1%i==0) {
                temp1+=i;
            }
        }

            for(int j=1; j<num2; j++){
                if(num2%j==0) {
                    temp2+=j;
                }
            }

            if (num2 == temp1 && num1 == temp2){
            return true;
            }
            return false;
        }




    }
