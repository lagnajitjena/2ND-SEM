/*Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to 
initialize the instance variables of the class. Another instance method display () to display the book 
information. A person purchase 5 different books. Display the book details which has the maximum 
price.  */

import java.util.Scanner;
class Book{
    String BName;
    double BPrice;
    int BEdition;
    Book(String BName, double BPrice, int BEdition){
        this.BPrice = BPrice;
        this.BEdition = BEdition;
        this.BName = BName;
    }
    void display(){
        System.out.println("NAME : " + BName + "\nEDITION : " + BEdition + "\nPRICE : " + BPrice);
    }
}
public class HA2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj [] = new Book[5];
        for(int i = 0; i<5; i++){
            System.out.println("Enter name of the Book");
            String str = sc.next();
            System.out.println("Enter the price of the Book");
            double price = sc.nextDouble();
            System.out.println("Enter book edition");
            int edition = sc.nextInt();
            obj [i] = new Book(str, price, edition);
        }
        double max = -1;
        int index = -1;
        for(int i = 0; i<5; i++){
            if(obj[i].BPrice>max){
                max = obj[i].BPrice;
                index = i;
            }
        }
        System.out.println("DETAILS : ");
        for(int i = 0; i<5; i++){
            System.out.println();
            obj[i].display();
        }
        System.out.println("DETAILS OF BOOK WITH MAXIMUM PRICE : ");
        obj[index].display();
        sc.close();
    }
}
