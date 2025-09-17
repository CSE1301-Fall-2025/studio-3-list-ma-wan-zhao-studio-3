import java.util.Scanner;

public class Sieve {

public static void main(String [] args){
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("give a number");
    int n = in.nextInt();

    int[] array = new int[n];

    for(int l=0; l<array.length; l++){
        array[l]=l+1; 
    }

    for(int i = 2; i<array.length; i++){
        for(int k = 2; i*k<=n; k++){
            int j=i*k;
            if(array[j-1]==j){
                array[j-1]=-1;
            }

        }

    }

    for(int l=0; l<array.length; l++){
        if(array[l]!=-1){
            System.out.println(array[l]);
        }
        
    }
        
    }
}

