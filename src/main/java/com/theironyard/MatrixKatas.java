package com.theironyard;

/**
 * Implement this class' methods as instructed below
 */
public class MatrixKatas {

    /**
     * Create a static method named createProductTable(). It should accept two
     * integer arguments representing the size of a two dimensional array. The
     * method will create an array of that size and populate it with the
     * associated products.
     * <p>
     * For example, arguments of 4, 3 would produce this matrix:
     * <p>
     * [
     * [0, 0, 0],
     * [0, 1, 2],
     * [0, 2, 4],
     * [0, 3, 6]
     * ]
     * <p>
     * Note that the outer array has four elements. Each inner array has three
     * elements. Let's call this array `products`. If we were to access
     * products[3,2] we would find 6.
     * <p>
     * This method returns an array of ints.
     *
     * @param a The size of the "outer" array of arrays of ints.
     * @param b The size of the "inner" arrays of ints.
     * @return A two dimensional array of integers where the value is the product of the array indexes
     */
    // todo: create createProductTable() method
    public static int[][] createProductTable(int a, int b) {
        int[][] product = new int[a][b];
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                product[x][y] = x * y;
            }
        }
        return product;
    }
}
