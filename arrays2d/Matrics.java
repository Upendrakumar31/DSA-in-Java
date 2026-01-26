package arrays2d;

import java.util.Scanner;

public class Matrics {
    public static boolean search(int matrics[][], int key){
        for(int i=0; i<matrics.length; i++){
            for(int j=0; j<matrics[0].length; j++){
                if(matrics[i][j]==key){
                    System.out.println("found at cell" + '('+ i+',' + j + ')');
                    return true;
                }
            }
        }
        System.err.println("Key not found");
        return false;
    }
     public static void maxValue(int matrics[][]){
        int Max = Integer.MIN_VALUE;
        for(int i=0; i<matrics.length; i++){
            for(int j=0; j<matrics[0].length; j++){
                int val = matrics[i][j];
                if(val > Max){
                    Max = val;
                }
            }
        }
        System.out.println("Largest val in the Matrix is " + Max);
    }

    public static void sumOfTheElement(int matrics[][]){
        int sum = 0;
        for(int i=0; i<matrics.length; i++){
            for(int j=0; j<matrics[i].length; j++){
                sum += matrics[i][j];
            }
        }
        System.out.println("Sum of all the elements is " + sum);
    }
    public static void minValue(int matrics[][]){
        int Min = Integer.MAX_VALUE;
        for(int i=0; i<matrics.length; i++){
            for(int j=0; j<matrics[i].length; j++){
                int val = matrics[i][j];
                if(val<Min){
                    Min = val;
                }
            }
        }
        System.out.println("Smallest val in the Matrix is " + Min);
    }
     public static void main(String[] args) {
        int matrics[][] = new int [3][3];
        int n=matrics.length , m=matrics[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrics[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrics[i][j] + " ");
            }
            System.out.println();
        }
        search(matrics,0);
        maxValue(matrics);
        sumOfTheElement(matrics);
        minValue(matrics);
    }
}
