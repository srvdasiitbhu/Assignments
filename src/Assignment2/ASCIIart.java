package Assignment2;

//Java program to print the ASCIIart
import java.util.*;
public class ASCIIart {

    //Fuction to draw the margin of the diamond
    public void art(int size) {
        int height = size * 2 + 1;
        int width = size * 2 + 2;
        int a = -(size+1);

        for(int i=1;i<=height;i++){
            a++;
            for (int j=1;j<=width;j++) {
                if((i == 1 || i == height) && (j == 1 || j == width))
                    System.out.print("+");
                else if((i == 1 || i == height) && !(j == 1 || j == width))
                    System.out.print("-");
                else if(!(i == 1 || i == height) && (j == 1 || j == width))
                    System.out.print("|");
                else {
                    draw(size, i, j, a);
                }
            }
            System.out.println();
        }
    }

    //Function to draw the diamond
    public void draw(int size, int i, int j, int a){
        int rowThickness;
        if (a <= 0){
            rowThickness = i*2-2;
        } else {
            rowThickness = (i-a*2)*2-2;
        }
        int midpoint = size + 1;
        int left = midpoint - (rowThickness/2-1);
        int right = midpoint + (rowThickness/2);
        int top = 1;
        int bottom = size * 2 + 1;

        if (j >= left && j <= right) {
            if (j == left || j == right) {
                if (i < midpoint && i > top) {
                    if (j == left) {
                        System.out.print("/");
                    } else {
                        System.out.print("\\");
                    }
                } else if (i == midpoint) {
                    if (j == left) {
                        System.out.print("<");
                    } else {
                        System.out.print(">");
                    }
                } else if (i > midpoint && i < bottom) {
                    if (j == left) {
                        System.out.print("\\");
                    } else {
                        System.out.print("/");
                    }
                }
            } else {
                if (i % 2 == 0) {
                    System.out.print("=");
                } else {
                    System.out.print("-");
                }
            }
        } else {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ASCIIart draw = new ASCIIart();
        int n = sc.nextInt();
        draw.art(n);

    }
}
