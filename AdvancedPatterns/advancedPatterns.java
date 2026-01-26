package AdvancedPatterns;

public class advancedPatterns {
    public static void hollow_rectangle(int totRows , int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            //inner loops
            for(int j=1; j<=totCols; j++){
                //boundary conditions
                if( i==1 || i==totRows || j==1 || j== totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invHalfPyramid(int totRows ,int totCols){
        //outer loop
        for(int i=1; i<=totRows;i++){
            //to print spaces
            for(int j=1; j<=totRows-i;j++){
                System.out.print(" ");
            }
            //to print stars
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                
            }
            System.out.println();
        } 
    }

    public static void invHalfPyramidWithNum(int n){
        for(int i= 1; i<=n; i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTraingle(){
        int n = 5;
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zerosOnesTraingle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //1st Half
        for(int i=1; i<=n; i++){
            //stars => i ke equal
            for(int j=1; j<=i; j++){
            System.out.print("*"); 
            }
            //spaces => 2*(n-i) ke equal
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //last stars => i ke equal
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        //2nd Half
        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void holllowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
        
        for(int j=1; j<=n; j++){
            if( i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(10 );
    }
}
