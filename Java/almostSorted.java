import java.io.*;
import java.util.*;

public class almostSorted {
    
    public static int[] reverse(int[] subAr){
        for(int i = 0; i < subAr.length / 2; i++){
            int temp = subAr[i];
            subAr[i] = subAr[subAr.length - i - 1];
            subAr[subAr.length - i - 1] = temp;
        }
        return subAr;
    }

    public static void check(int[] ar, int left, int right)
    {
        int[] reverseAr = Arrays.copyOfRange(ar, left, right+1);
        int[] swapAr = Arrays.copyOfRange(ar, 0, ar.length);
        
        Arrays.sort(ar);
        reverse(reverseAr);
        int swap = swapAr[left];
        swapAr[left] = swapAr[right];
        swapAr[right] = swap;
        
        if(Arrays.equals(swapAr, ar)){
            System.out.println("yes");
            System.out.println("swap" + " " + (left+1) + " " + (right+1));
        }
        else if(Arrays.equals(reverseAr, Arrays.copyOfRange(ar, left, right+1))){
            System.out.println("yes");
            System.out.println("reverse " + (left+1) + " " + (right+1));
        }
        else{
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        int[] ar = new int[size];
        int left = 0;
        int right = size - 1;
        
        for(int k = 0; k < size; k++){
            int temp = scan.nextInt();
            ar[k] = temp;
        }
        while(true){
            if(left < size - 1 && right >= 0){
                if(ar[left] > ar[left+1] && ar[right] < ar[right-1]){
                    check(ar, left, right);
                    break;
                }
                else if(ar[left] > ar[left + 1]){
                    right--;
                }
                else if(ar[right] < ar[right - 1]){
                    left++;
                }
                else{
                    right--;
                    left++;
                }
            }
            else{
                break;
            }
        }
    }
}