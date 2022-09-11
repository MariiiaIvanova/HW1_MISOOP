import java.util.Scanner;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Таблица умножения");
        int[][] myArray = new int[10][10];
        int counter = 0;
        for (int i = 0; i<1; i++){
            for(int j = 0; j<myArray.length; j++) {
                myArray[i][j] = counter;
                counter++;
            }
        }
        counter=1;
        for (int i = 1; i<myArray.length; i++){

            for(int j = 0; j<myArray.length; j++) {

                myArray[i][j] =  myArray[0][j]*counter;
                if (j==0){
                    myArray[i][j] = counter;
                }
            }
            counter++;
        }
        for (int i = 0; i<myArray.length; i++){
            for(int j = 0; j<myArray.length; j++) {
                System.out.print(myArray[i][j]+"\t");

            }
            System.out.println();
        }


        System.out.println("\nВведите числа a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d=(b*b)-(4*a*c);
        if (d<0) {
            System.out.println("Нет вещественных корней");
            System.exit(0);
        }
        if (a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Корнем является любое число");
                }
                else{
                    System.out.println("Нет решений");
                }
            }
            else{
                System.out.println((-c)/b);
            }
            System.exit(0);
        }
        double xTneFirst=((-b+Math.sqrt(d))/(2*a));
        double xTheSecond=((-b-Math.sqrt(d))/(2*a));
        System.out.println(xTneFirst+" "+ xTheSecond);


        }
    }
