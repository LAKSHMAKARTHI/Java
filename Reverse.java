import java.io.*;
class Reverse{
public static void main(String lk[]){
int remainder,temp,num,rev=0;
Scanner sc=new Scanner(System.in);
num=sc.nextint();
temp=num;
System.out.println("Your given values"+temp);
while(num>0){
remainder=num%10;
rev=rev*10+remainder;
num/=10;
}
System.out.println("Reverse numeber"+rev);
}
}
