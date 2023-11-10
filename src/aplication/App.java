package aplication;

import entities.ImportedProducts;
import entities.Products;
import entities.UsedProducts;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("enter the number of products: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<Products>  list = new ArrayList<>();
        String name;
        double price;


        for (int i = 1; i <= x; i++){
            System.out.println("enter the product "+ i +":");
            System.out.println("comom,used or imported (c/u/i)?");
            char category = sc.next().charAt(0);
            System.out.println("enter the product name: ");
            name = sc.next();
            System.out.println("enter the product price: ");
            price = sc.nextDouble();

            if (category == 'i'){
                System.out.println("enter custom fee: ");
                double customFee = sc.nextDouble();
                Products products = new ImportedProducts(name,price,customFee);
                list.add(products);
            }else if (category == 'c'){
                Products products = new Products(name,price);
                list.add(products);
            }else if (category == 'u'){
                LocalDateTime manufacturedDate = LocalDateTime.now();
                Products products = new UsedProducts(name,price,manufacturedDate);
                list.add(products);
            }else {
                System.out.println("invalid input!!");
            }
        }
        for (Products prod : list){
            System.out.println(prod.getName() + " _ " + prod.priceTag());
        }
        sc.close();
    }
}
