import java.util.*;
public class main{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
char a = scanner.next().charAt(0);
int b = scanner.nextInt();
int c = scanner.nextInt();
int result = 0;
switch(a){
case'+':
result = b+c;
break;
case'-':
result = b-c;
break;
case'*':
result = b*c;
break;
case'/':
result = b/c;
break;
case'%':
result = b%c;
break;
default:
System.out.println("Invalid");
return;}
System.out.println(result);
}}
// SAMPLE INPUT & OUTPUT
// INPUT
// +
// 5
// 4
// OUTPUT
// 9

