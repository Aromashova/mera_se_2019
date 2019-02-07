package ru.mera.romazanova.task5;

public class Test5 {

    public static void main(String[] args) {
        final Shop newShop = new Shop();
        System.out.println("List of all goods in the shop: ");
        newShop.gooddiscribePrinter();
        System.out.println();
        newShop.revenueFromSalesOfAllGoods();
        System.out.println("\n");
        newShop.getToolWithMaxPowerConsumption();
        System.out.println("\n");
        newShop.sumOfHardDriveSpaceofAllComputersInShop();
        System.out.println("\n");
        System.out.println("List of all goods which can be returned in the shop:");
        newShop.listOfReturnableGoods();

    }

}
