package task5;

abstract class PowerTool extends AbstractItem{
    private long power;

    PowerTool(long countValue, String nameValue, int quantityValue, long p){

        super(countValue,nameValue,quantityValue);
        power=p;
    }
    long getPower() {
        return power;
    }

    @Override
    public long getCount() {
        return super.getCount();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }
}
