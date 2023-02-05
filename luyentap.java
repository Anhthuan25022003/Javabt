import java.util.Scanner;

 

public class Main {

 

public static void main(String[] args) {

Main.giaipt();

Main m=new Main();

System.out.println(m.GT(6));

System.out.println(m.fibo(7));

 

}

static void giaipt() {

Scanner nhapp=new Scanner(System.in);

float a;

float b;

float c;

System.out.println("Nhap a,b,c: ");

a=nhapp.nextFloat();

b=nhapp.nextFloat();

c=nhapp.nextFloat();

float x1,x2,del;

if(a==0) {

System.out.println("x = "+(-c/b));

}

else {

del=(float) (Math.pow(b, 2) -4*a*c);

if(del==0) {

System.out.println("X1=X2= "+(b/(2*a)));

}

else if(del<0){

System.out.println("Vo nghiem");

}

else {

x1=(float) (-b+Math.sqrt(del))/2*a;

x2=(float) (-b-Math.sqrt(del))/2*a;

System.out.println("X1= "+x1);

System.out.println("X2= "+x2);

String s= String.format("x1=%f x2=%f", x1,x2)

}

}

 

}

long GT(int n) {

        long giai_thua = 1;

        if (n == 0 || n == 1) {

            return giai_thua;

        } else {

            for (int i = 2; i <= n; i++) {

                giai_thua *= i;

            }

            return giai_thua;

        }}

long fibo(int n) {

if(n==1||n==2) {

return 1;

}

else {

return fibo(n-1)+fibo(n-2);

}

}

 

 

}

 