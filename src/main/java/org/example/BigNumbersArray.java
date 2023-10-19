package org.example;

public class BigNumbersArray {

    //summe von 2 nr
    public static int[] addLargeNumbers(int[] num1, int[] num2) {
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
    public static int[] subtractLargeNumbers(int[] num1, int[] num2) {
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
    public static int[] multiplyLargeNumberByDigit(int[] num, int digit) {
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
    public static int[] divideLargeNumberByDigit(int[] num, int digit) {
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
