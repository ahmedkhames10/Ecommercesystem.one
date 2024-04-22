
import java.util.Scanner;
public class Ecommercesystem1 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        Electronicproduct e1= new Electronicproduct(1,"smart phone",599.9f,"Samsung",1);
        Clothingproduct c1=new Clothingproduct(2,"T-Shirt",19.99f,"Medium","Cotton");
        Bookproduct b1=new Bookproduct(3,"OOP",39.99f,"O'Reilly","X Publciations");
        System.out.println("Welcome to E-Commerce System!");
        System.out.println("How many Products you want to add to your cart?");
        int numProducts= input.nextInt();
        System.out.println(" enter Your name");
        String Name = input.next();
        input.nextLine();
        System.out.println(" enter you address");
        String address = input.next();
        input.nextLine();
        System.out.println(" enter Your ID");
        int id= input.nextInt();
        Customer ak=new Customer(id,Name,address);
        Product[] MyProducts=new Product[numProducts];
        Cart akcart=new Cart(id,numProducts,MyProducts);
        Order akorder=new Order(akcart.calculatePrice(), 1,numProducts,id,MyProducts);
    for(int i=0;i<numProducts;i++){
        System.out.print("Which Product would you like to add? ");
        System.out.println("1- SmartPhone 2-T-shirt 3- OOP");
   int choice=input.nextInt();
            if (choice==1) {
                MyProducts[i] =e1;
            }
            else if(choice==2){
                MyProducts[i]=c1;
            }
            else if(choice==3){
                MyProducts[i]=b1;
            }

    }
        System.out.println("the total price now is: "+akorder.getTotalPrice());


    System.out.print("Do You want to place order? ");
    System.out.println("1-Yes 2-No");
    int var = input.nextInt();
    if(var==1){
        System.out.println("your Order Summary is : " );
        akorder.printOrderInfo();


    }
    else if(var==2){
        System.out.println("**********");

    }
    }
}

   