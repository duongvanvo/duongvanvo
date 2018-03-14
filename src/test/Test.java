
package test;
import java.util.Scanner;
public class Test {

  
    public static void main(String[] args) {
        int n;
  float array[] = new float[100];
  Scanner nhap = new Scanner (System.in);
  System.out.println("Nhap so phan tu cua mang: ");
  n = nhap.nextInt();
  for (int i=0;i<n;i++)
  {
   System.out.println("Nhap phan tu thu "+i+" cua mang: ");
   array[i] = nhap.nextFloat();
  }
        float max = array[0];
        for (int i=0;i<n;i++)
        {
            if(max<array[i])
                max=array[i];
        }
        System.out.println("So lon nhat là");
        System.out.println(max);
    }
}
