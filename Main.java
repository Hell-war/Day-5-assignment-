/*Write a function that takes a positive integer n and returns the sum of all integers from 1 to n.*/

import java.util.Scanner;
public class Main{
public static void main(String [] args){
int a,b,sum;
Scanner s= new Scanner(System.in);
a=s.nextInt();
int c= sum(a);
System.out.println("The sum of 0 to "+a+" numbers are :"+ c);
}
public static int sum(int a){
int n = a;
int s=0;
for (int i=0;i<=n;i++){
s +=i;
}
return s;
}}