package Task1;

abstract class ComputerItems extends AbstractItem{
    int memorySize;
    int HDSize;
    int CPUCoreCount;

    public int getMemorySize() {
        return memorySize;
    }

    public int getHDSize() {
        return HDSize;
    }

    public int getCPUCoreCount() {
        return CPUCoreCount;
    }

    void show(){
        System.out.println("type:" + this.getClass().getSimpleName() + ", "
                +"name:" +  this.getName() + ", "
                +"price:" +  this.getPrice() + ", "
                +"quantity:" +  this.getQuantity() + "(pieces), "
                +"memory size:" +  this.getMemorySize() + ", "
                +"HD size:" +  this.getHDSize() + ", "
                +"core count:" +  this.getCPUCoreCount()
                + this.getOptions());
    }
}
