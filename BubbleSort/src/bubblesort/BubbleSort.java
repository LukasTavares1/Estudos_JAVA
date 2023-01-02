package bubblesort;

import java.util.Scanner;

public class BubbleSort {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
      
    int[] v = new int[5];
    
    for (int k=0;k<5;k++ ){
        System.out.print("Digite o numero: ");
        v[k] = input.nextInt();        
    }
    BubbleSort bs = new BubbleSort();
    bs.ordenar(v);
    for(int num : v) {
      System.out.print(num + " ");
    }
  }
  
  public void ordenar(int[] v) {
    for(int i = 0; i < v.length; i++) {
      for (int j = 0; j < i; j++) {
        if (v[i] > v[j]) {
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
      }
    }
  }
}