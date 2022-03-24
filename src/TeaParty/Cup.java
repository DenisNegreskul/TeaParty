package TeaParty;

class Cup extends Crockery {
    protected Cup(int maxCapacity, double speed) {
        super(maxCapacity, speed, "cup");
    }

    @Override
    protected double fillUp(int volume) {
        volume = (int)super.fillUp(volume);
        display(volume, "fill up");
        return volume / speed;
    }

    @Override
    protected double pourOut(int volume) {
        volume = (int)super.pourOut(volume);
        display(volume, "pour out");
        return volume / speed;
    }
}
