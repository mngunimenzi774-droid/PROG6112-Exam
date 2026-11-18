/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;
/**
 *
 * @author Student
 */
public class Product implements IProducts {

    private final String[] products;
    private final int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int getTotalSales() {

        int total = 0;

        for (int[] sale : sales) {
            for (int j = 0; j < sale.length; j++) {
                total += sale[j];
            }
        }

        return total;
    }

    @Override
    public double getAverageSales() {

        int total = getTotalSales();
        int count = 0;

        for (int[] sale : sales) {
            count += sale.length;
        }

        return (double) total / count;
    }

    @Override
    public String getMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularIndex = i;
            }
        }

        return products[popularIndex] + " (" + highestSales + ")";
    }
}

