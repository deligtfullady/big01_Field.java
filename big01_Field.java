package com.javarush.test.level22.lesson18.big01;

import java.util.Map;

/**
 * Created by aavdeev on 08.06.2016.
 */
public class Field
{
    private int width;
    private int height;
    private int[][] matrix;


    public Field(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.matrix = new int[width][height];
    }

    public int[][] getMatrix()
    {
        return matrix;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void print() {
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                if (matrix[i][j] == 0) {
                    System.out.print(".");
                } else System.out.print("X");
            }
            System.out.println();
        }
    }

    public void removeFullLines()
    {

    }
    void setValue(int x, int y, int value)
    {

    }
    public Integer getValue(int x, int y)
    {

        return matrix[y][x];
    }
    
}
