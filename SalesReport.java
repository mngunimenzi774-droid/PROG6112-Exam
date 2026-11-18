/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class SalesReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Single-dimensional array
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Two-dimensional array
        int[][] sales = new int[3][3];

        // Collect sales information
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

   Product productReport = new Product(products, sales);

// Create PrintProduct object
PrintProduct printer = new PrintProduct(productReport);

// Display report
System.out.println();
System.out.println("PRODUCT SALES REPORT - 2026");
System.out.println("***************************************");

printer.printTotalProductSales();

printer.printAverageProductSales();

printer.printMostPopularProduct();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

 