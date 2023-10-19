package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectronicShopTest {

    @Test
    public void testFindCheapestKeyboard() {
        int[] keyboards = {40, 35, 70, 15, 45};
        int expected = 15;
        assertEquals(expected, ElectronicShop.findCheapestKeyboard(keyboards));
    }

    @Test
    public void testFindCheapestKeyboardWithEmptyList() {
        int[] keyboards = {};
        int expected = -1; // Unerwarteter Fall: leere Preisliste
        assertEquals(expected, ElectronicShop.findCheapestKeyboard(keyboards));
    }

    @Test
    public void testFindMostExpensiveItem() {
        int[] keyboards = {15, 20, 10, 35};
        int[] usbDrives = {20, 15, 40, 15};
        int expected = 40;
        assertEquals(expected, ElectronicShop.findMostExpensiveItem(keyboards, usbDrives));
    }

    @Test
    public void testFindMostExpensiveItemWithEmptyLists() {
        int[] keyboards = {};
        int[] usbDrives = {};
        int expected = -1; // Unerwarteter Fall: leere Preislisten
        assertEquals(expected, ElectronicShop.findMostExpensiveItem(keyboards, usbDrives));
    }

    @Test
    public void testFindMaxUsbDriveAffordable() {
        int[] usbDrives = {15, 45, 20};
        int budget = 30;
        int expected = 20;
        assertEquals(expected, ElectronicShop.findMaxUsbDriveAffordable(usbDrives, budget));
    }

    @Test
    public void testFindMaxUsbDriveAffordableWithNoAffordableDrive() {
        int[] usbDrives = {40, 50, 60};
        int budget = 30;
        int expected = 0; // Unerwarteter Fall: Kein erschwingliches USB-Laufwerk
        assertEquals(expected, ElectronicShop.findMaxUsbDriveAffordable(usbDrives, budget));
    }

    @Test
    public void testFindTotalSpent() {
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int budget = 60;
        int expected = 58;
        assertEquals(expected, ElectronicShop.findTotalSpent(keyboards, usbDrives, budget));
    }

    @Test
    public void testFindTotalSpentWithInsufficientBudget() {
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int budget = 30;
        int expected = -1; // Unerwarteter Fall: Nicht genug Budget für beide Gegenstände
        assertEquals(expected, ElectronicShop.findTotalSpent(keyboards, usbDrives, budget));
    }
}
