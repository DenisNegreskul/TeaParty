package TeaParty;

class Crockery {
    protected final int maxCapacity;
    protected int currentVolume;
    protected String crockeryType = "vessel";
    protected double speed;

    protected Crockery(int maxCapacity, double speed, String crockeryType) {
        this.maxCapacity = maxCapacity;
        this.speed = speed;
        this.crockeryType = crockeryType;
        System.out.printf("A %s with maximum volume of %d was added.\n", crockeryType, maxCapacity);
    }

    protected double fillUp(int volume) {
        volume = Math.abs(volume);
        if (currentVolume + volume >= maxCapacity) {
            volume = maxCapacity - currentVolume;
            currentVolume = maxCapacity;
        } else {
            currentVolume += volume;
        }
        return volume;
    }

    protected double pourOut(int volume) {
        volume = Math.abs(volume);
        if (currentVolume - volume <= 0) {
            volume = currentVolume;
            currentVolume = 0;
        } else {
            currentVolume -= volume;
        }
        return volume;
    }

    protected void display(int volume, double speed, String action) {
        System.out.printf("%f seconds were spent to %s %d milliliters.\n", volume / speed, action, volume);
        if (currentVolume >= maxCapacity) {
            System.out.println("The " + crockeryType + " is full.");
        } else if (currentVolume <= 0) {
            System.out.println("The " + crockeryType + " is empty.");
        } else {
            System.out.println("The " + crockeryType + " now has " + currentVolume + " milliliters in it.");
        }
    }
}
