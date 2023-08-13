import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int re = sc.nextInt();
        int a = 1000-re;
        int b=a/500;
        a=a%500;
        int c = a/100;
        a=a%100;
        int d = a/50;
        a=a%50;
        int e = a/10;
        a=a%10;
        int f = a/5;
        a=a%5;
        int g = a;
        println(b+c+d+e+f+g); 
    }
}