import java.util.Scanner;

public class OperacionMatematica <T extends Number> {
    private T num1;
    private T num2;

    public OperacionMatematica(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    public double suma() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double resta() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiplicacion() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double division() {
        return num1.doubleValue() % num2.doubleValue();
    }
}
