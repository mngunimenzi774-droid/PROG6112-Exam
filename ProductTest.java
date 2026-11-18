/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Laptop", "Phone"};
        int[][] sales = {
            {10, 20},
            {30, 40}
        };
        Product product = new Product(products, sales);

        int expected = 100;
        int actual = product.getTotalSales(); // <-- FIXED NAME

        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Laptop", "Phone"};
        int[][] sales = {
            {10, 20},
            {30, 40}
        };
        Product product = new Product(products, sales);

        double expected = 25.0;
        double actual = product.getAverageSales(); // <-- FIXED NAME

        assertEquals(expected, actual, 0.01);
    }
}
