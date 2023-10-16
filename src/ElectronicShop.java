public class ElectronicShop {
    //billigste Tastatur
    public static int findCheapestKeyboard(int[] keyboards) {
        int minPrice = Integer.MAX_VALUE;
        for (int price : keyboards) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    //teuerste Gegenstand
    public static int findMostExpensiveItem(int[] keyboards, int[] usbDrives) {
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
    public static int findMaxUsbDriveAffordable(int[] usbDrives, int budget) {
        int maxPrice = 0;
        for (int price : usbDrives) {
            if (price <= budget && price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    //ganzer Geldbetrag
    public static int findTotalSpent(int[] keyboards, int[] usbDrives, int budget) {
        int maxKeyboardPrice = findCheapestKeyboard(keyboards);
        int maxUsbDrivePrice = findMaxUsbDriveAffordable(usbDrives, budget);

        if (maxKeyboardPrice == Integer.MAX_VALUE || maxUsbDrivePrice == 0) {
            return -1;
        }

        int totalSpent = maxKeyboardPrice + maxUsbDrivePrice;
        return totalSpent;
    }

}
