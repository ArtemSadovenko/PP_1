package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Matrix {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return n == matrix.n && m == matrix.m && Arrays.equals(arr, matrix.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(n, m);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    private int n;
    private int m;
    private int[][] arr;

    public Matrix(int a, int b) {
        n = a;
        m = b;
        arr = new int[n][m];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(1, 20);
            }
        }
    }

    public Matrix(Matrix tmp){
        arr = new int[tmp.n][tmp.m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                arr[i][j] = tmp.arr[i][j];
            }
        }
    }

    public void print(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4s", arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void transpon(){
        Matrix tmp = new Matrix(m, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp.setArr(j, i, arr[i][j]);
            }
        }
        arr = new int[tmp.n][tmp.m];
        n = tmp.n;
        m = tmp.m;
        for (int i = 0; i < tmp.n; i++) {
            for (int j = 0; j < tmp.m; j++) {
                arr[i][j] = tmp.arr[i][j];
            }
        }
    }

    public void setArr(int a, int b, int tmp){
        arr[a][b] = tmp;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
