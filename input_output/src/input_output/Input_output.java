
package input_output;

import java.util.Scanner;

public class Input_output {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        float b;
        double c;
        String s;
        System.out.println("Enter intrger value:");
        a=input.nextInt();
        System.out.println("Enter Float value:");
        b=input.nextFloat();
        System.out.println("Enter double value:");
        c=input.nextDouble();
        System.out.println("Enter strng value:");
        s=input.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
                       
    }
}
