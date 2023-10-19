package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectronicShopTest {

    @Test
    public void expected_testFindCheapestKeyboard() {
        ElectronicShop electronicShop = new ElectronicShop();
        int[] keyboards = {40, 35, 70, 15, 45};
        int expected = 15;
        assertEquals(expected, electronicShop.findCheapestKeyboard(keyboards));
    }

    @Test
    public void unexpected_testFindCheapestKeyboardWithEmptyList() {
        ElectronicShop electronicShop = new ElectronicShop();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> electronicShop.findCheapestKeyboard(new int[]{}));
    }

    @Test
    public void expected_testFindMostExpensiveItem() {
        ElectronicShop electronicShop = new ElectronicShop();

        int[] keyboards = {15, 20, 10, 35};
        int[] usbDrives = {20, 15, 40, 15};
        int expected = 40;
        assertEquals(expected, electronicShop.findMostExpensiveItem(keyboards, usbDrives));
    }

    @Test
    public void unexpected_testFindMostExpensiveItemWithEmptyLists() {
        ElectronicShop electronicShop = new ElectronicShop();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> electronicShop.findMostExpensiveItem(new int[]{}, new int[]{}));
    }

    @Test
    public void expected_testFindMaxUsbDriveAffordable() {
        ElectronicShop electronicShop = new ElectronicShop();
        int[] usbDrives = {15, 45, 20};
        int budget = 30;
        int expected = 20;
        assertEquals(expected, electronicShop.findMostAffordableUSBDrive(usbDrives, budget));
    }

    @Test
    public void unexpected_testFindMaxUsbDriveAffordableWithNoAffordableDrive() {
        ElectronicShop electronicShop = new ElectronicShop();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> electronicShop.findMostAffordableUSBDrive(new int[0], 50));
    }

    @Test
    public void expected_testFindTotalSpent() {
        ElectronicShop electronicShop = new ElectronicShop();
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int budget = 60;
        int expected = 58;
        assertEquals(expected, electronicShop.findTotalSpent(keyboards, usbDrives, budget));
    }

    @Test
    public void expected_testFindTotalSpentWithInsufficientBudget() {
        ElectronicShop electronicShop = new ElectronicShop();
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int budget = 30;
        int expected = -1; // Unerwarteter Fall: Nicht genug Budget für beide Gegenstände
        assertEquals(expected, electronicShop.findTotalSpent(keyboards, usbDrives, budget));
    }

    @Test
    public void unexpected_testFindTotalSpent() {
        ElectronicShop electronicShop = new ElectronicShop();
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->electronicShop.findTotalSpent(new int[0], new int[0], 60));
    }
}
