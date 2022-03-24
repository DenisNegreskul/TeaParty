package TeaParty;

class Teapot extends Crockery {
    private final double speedFactor;

    protected Teapot(int maxCapacity, double speed, double speedFactor) {
        super(maxCapacity, speed, "teapot");
        this.speedFactor = speedFactor;
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
        return volume / (speed * speedFactor) ;
    }
}
