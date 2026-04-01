package vn.edu.ueh.bit.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(endpointInterface = "vn.edu.ueh.bit.services.CalculatorWs")
public class CalculatorWsImpl implements CalculatorWs {
    @Override
    @WebMethod
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    @WebMethod
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    @WebMethod
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    @WebMethod
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}