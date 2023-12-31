package org.example;

public class ElectronicShop {

    //billigste Tastatur
    public int findCheapestKeyboard(int[] keyboards) {
        if (keyboards.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int minPrice = Integer.MAX_VALUE;
        for (int price : keyboards) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    //teuerste Gegenstand
    public int findMostExpensiveItem(int[] keyboards, int[] usbDrives) {
        if (keyboards.length * usbDrives.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int maxPrice = Integer.MIN_VALUE;
        for (int price : keyboards) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        for (int price : usbDrives) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }


    //teuerste USB-Laufwerk
    public int findMostAffordableUSBDrive(int[] usbDrives, int budget) {
        if (usbDrives.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }
        int maxPrice = 0;
        for (int price : usbDrives) {
            if (price <= budget && price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    //ganzer Geldbetrag
    public int findTotalSpent(int[] keyboards, int[] usbDrives, int budget) {
        if (keyboards.length * usbDrives.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array is empty!");
        }

        int maxTotal = -1, total;

        for (int keyboard: keyboards) {
            for (int usb : usbDrives) {
                total = keyboard + usb;
                if (budget >= total && maxTotal < total) {
                    maxTotal = total;
                }
            }
        }
        return maxTotal;
    }
}
