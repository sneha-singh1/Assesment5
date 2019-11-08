package Main;

import java.util.List;
import java.util.Scanner;

import Dao.doa;
import model.Product;

public class Main {

	public static void main(String[] args) {
		 int option = 0;
		
	        Scanner s = new Scanner(System.in);
            doa fd=new doa();
		 
		  do{
	            System.out.println("\nMENU");
	            System.out.println("If stockManager then:");
	            System.out.println("1. Add Product");
	            System.out.println("2. Update List of Product in Stock");
	            System.out.println("3. Delete Product details in the stock");
	            System.out.println("4. Print Product details in the stock");
	            System.out.println("Option:");
	            option=s.nextInt();
	            switch (option){
                case 1:
                     fd.addProduct(); 
                    break;
                case 2:
                	System.out.println("Name of the product to update:");
                	String name=s.next();
                	fd.updateProduct(name);
                    break;
                case 3:
                	System.out.println("Name of the product to delete:");
                	String name1=s.next();
                	fd.deleteProduct(name1);
                	break;
                	
                case 4:
                    List<Product> gh=fd.printProduct();
                    for(Product i:gh)
                    {
                    	System.out.println(i);
                    }
 
                default:
                	option=8;
                	break;
            }
        }while ( option !=8);	

	}

}
