/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */


public class PrintProduct {

    private final Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    // Print total product sales
    public void printTotalProductSales() {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.getTotalSales());
    }

    // Print average product sales
    public void printAverageProductSales() {

        System.out.println("AVERAGE PRODUCT SALES: "
                + product.getAverageSales());
    }

    // Print most popular product
    public void printMostPopularProduct() {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.getMostPopularProduct());
    }

}
