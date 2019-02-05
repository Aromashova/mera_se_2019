package ru.mera.romazanova.task5;

public class Shop {
    int index = 0; //
    private final AbstractItem[] shop = new AbstractItem[100];

    Shop() {
        shop[0] = new Drill(200, "Bosh", 2, 100, 20);
        shop[1] = new Drill(100, "Zubr", 10, 100, 10);
        shop[2] = new Saw(150, "Bosh", 5, 220, 150);
        shop[3] = new Saw(200, "BoshTurbo", 2, 220, 300);
        shop[4] = new Jigsaw(100, "JigsawWithMAxPowerCons", 2, 300, 120);
        shop[5] = new Jigsaw(200, "JigsawPlus", 1, 250, 120);
        shop[6] = new Laptop(500, "Aser", 3, 3, 20, 2, 30, 12);
        shop[7] = new Laptop(800, "Sumsung", 2, 8, 30, 3, 30, 24);
        shop[8] = new Monoblock(300, "Sumsung1", 1, 5, 20, 2);
        shop[9] = new Monoblock(500, "Sumsung2", 2, 4, 20, 4);

    }

    public AbstractItem getItem(int index) {
        if (index < shop.length) {
            return shop[index];
        } else {
            return null;
        }
    }

    public void gooddiscribePrinter() {
        for (int i = 0; i < shop.length; i++) {
            final AbstractItem arstarcItem = getItem(i);
            if (arstarcItem != null) {
                System.out.print(arstarcItem.toString());
            } else {
                break;
            }
        }
    }

    public int revenueFromSalesOfAllGoods() {
        int sum = 0;
        for (int i = 0; i < shop.length; i++) {
            final AbstractItem arstarcItem = getItem(i);
            if (arstarcItem != null) {
                sum += ((arstarcItem.getCount() * arstarcItem.getQuantity()));
            } else {
                break;
            }
        }

        System.out.printf("The shop can sell all their goods on sum: %d", sum);
        return sum;
    }

    public int sumOfHardDriveSpaceofAllComputersInShop() {
        int sum = 0;
        for (int i = 0; i < shop.length; i++) {
            final AbstractItem arstarcItem = getItem(i);
            if (arstarcItem instanceof Computers) {
                sum += (((Computers) arstarcItem).getHardDriveSpace());
            } else {
                continue;
            }

        }
        System.out.printf("Sum of hard drive space of all computers in the shop: %d", sum);
        return sum;

    }

    final ElectricalTools[] tempContainerForElectricalTools = new ElectricalTools[shop.length];

    private ElectricalTools getElectricalItem(int index) {
        if (index < tempContainerForElectricalTools.length) {
            return tempContainerForElectricalTools[index];
        } else {
            return null;
        }
    }

    public ElectricalTools getToolWithMaxPowerConsumption() {

        for (int i = 0; i < shop.length; i++) {
            final AbstractItem abstractItem = getItem(i);
            if (abstractItem != null & abstractItem instanceof ElectricalTools) {
                tempContainerForElectricalTools[i] = (ElectricalTools) abstractItem;
            } else {
                break;
            }
        }

        int maxPower = 0;
        ElectricalTools toolWithMaxPower = null;
        for (int i = 0; i < tempContainerForElectricalTools.length; i++) {
            final ElectricalTools tempElectricalTool = getElectricalItem(i);
            while (tempElectricalTool != null) {
                if (maxPower < tempElectricalTool.getPowerconsumption()) {
                    maxPower = tempElectricalTool.getPowerconsumption();
                    toolWithMaxPower = tempElectricalTool;
                } else {
                    break;
                }
            }
        }
        System.out.print("The tool with max power consumption is " + toolWithMaxPower.toString());
        return toolWithMaxPower;
    }

    public void listOfReturnableGoods() {
        for (int i = 0; i < shop.length; i++) {
            final AbstractItem abstractItem = getItem(i);

            if (abstractItem instanceof Returnable) {
                if ((((Returnable) abstractItem).getRequiredDocument()) != null
                        && (((Returnable) abstractItem).getDaysForReturn()) != 0) {
                    System.out.println(abstractItem.getTypeOfGood() + " " + abstractItem.getName()
                            + " can be returned during " + ((Returnable) abstractItem).getDaysForReturn()
                            + " days. The following documents should be provided: "
                            + ((Returnable) abstractItem).getRequiredDocument());
                }

                else if ((((Returnable) abstractItem).getRequiredDocument()) != null
                        && (((Returnable) abstractItem).getDaysForReturn()) == 0) {
                    System.out.println(abstractItem.getTypeOfGood() + " " + abstractItem.getName()
                            + " can be returned without restrictions on the number of days."
                            + " The following documents should be provided: "
                            + ((Returnable) abstractItem).getRequiredDocument());
                } else {
                    continue;
                }

            }

        }
    }
}
