package labs;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
class Scan {
    public static void main(String args[]){
        System.out.print("Enter the name of the student");
        Scanner scan = new Scanner(System.in);
        String	line	=	scan.nextLine();
        System.out.println ("Вы ввели число " + scan);
    }
}