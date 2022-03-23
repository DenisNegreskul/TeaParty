package TeaParty;

class Cup extends Crockery {
    protected Cup(int maxCapacity, double speed) {
        super(maxCapacity, speed, "cup");
    }

    @Override
    protected double fillUp(int volume) {
        volume = (int)super.fillUp(volume);
        display(volume, speed, "fill up");
        return volume / speed;
    }

    @Override
    protected double pourOut(int volume) {
        volume = (int)super.pourOut(volume);
        display(volume, speed, "pour out");
        return volume / speed;
    }
}
