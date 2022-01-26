package lesson3_oop;

import java.util.Random;

public class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];
        Random rnd = new Random();
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                this.matrix[i][j] = roundDouble(9*rnd.nextDouble());
            }
        }
    }

    private double roundDouble(double d){
        double scale = Math.pow(10, 2);
        return Math.ceil(d * scale) / scale;
    }

    public double[][] addMatrix(double[][] inputMatrix){
        for (int i=0; i<this.rows; i++){
            for (int j=0; j<this.cols;j++){
                this.matrix[i][j]=roundDouble(this.matrix[i][j]+inputMatrix[i][j]);
            }
        }
        return this.matrix;
    }

    public double[][] multiplyMatrixOnDigit(double value){
        for (int i=0; i<this.rows; i++){
            for (int j=0; j<this.cols;j++){
                this.matrix[i][j]=roundDouble(this.matrix[i][j]*value);
            }
        }
        return this.matrix;
    }

    public void printMatrix(){
        for (int i=0; i<this.rows; i++){
            for (int j=0; j<this.cols;j++){
                System.out.print(this.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public double[][] multiplyMatrix(double[][] inputMatrix){
        for (int i=0; i<this.rows; i++){
            for (int j=0; j<this.cols;j++){
                this.matrix[i][j]=roundDouble(this.matrix[i][j]*inputMatrix[i][j]);
            }
        }
        return this.matrix;
    }


}
