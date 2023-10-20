package org.example;

public class BigNumbersArray {

    //summe von 2 nr
    public int[] addLargeNumbers(int[] num1, int[] num2) throws Exception {

        if (num1.length == 0 || num2.length == 0) {
            throw new Exception("Empty Array!");
        }

        if (num1.length != num2.length) {
            throw new Exception("Array lengths do not match!");
        }

        int n = num1.length;
        int carry = 0;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        } else {
            return result;
        }
    }

    //dif von 2 nr
    public int[] subtractLargeNumbers(int[] num1, int[] num2) throws Exception {

        if (num1.length * num2.length == 0) {
            throw new Exception("Empty Array!");
        }

        if (num1.length != num2.length) {
            throw new Exception("Array lengths do not match!");
        }

        int n = num1.length;
        int borrow = 0;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }

    //multiplikation von 2 nr
    public int[] multiplyLargeNumberByDigit(int[] num, int digit) throws Exception {
        if (num.length == 0) {
            throw new Exception("Empty Array!");
        }

        int n = num.length;
        int carry = 0;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        } else {
            return result;
        }
    }

    //division
    public int[] divideLargeNumberByDigit(int[] num, int digit) throws Exception {
        if (num.length == 0) {
            throw new Exception("Empty Array!");
        }
        if (digit == 0) {
            throw new Exception("Cannot divide by 0!");
        }
        int n = num.length;
        int[] result = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int dividend = num[i] + remainder * 10;
            result[i] = dividend / digit;
            remainder = dividend % digit;
        }

        return result;
    }

}
