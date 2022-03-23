package TeaParty;

public class TeaParty {
    private final Crockery[] crockeryArray;
    private int counter = 0;
    private double time = 0;

    public TeaParty(int amountOfCrockery) {
        crockeryArray = new Crockery[amountOfCrockery];
    }

    public void addTeapot(int maxCapacity, double speed, double speedFactor) {
        if (counter < crockeryArray.length) {
            crockeryArray[counter++] = new Teapot(maxCapacity, speed, speedFactor);
        } else {
            System.out.println("There is no place remained!");
        }
    }

    public void addCup(int maxCapacity, double speed) {
        if (counter < crockeryArray.length) {
            crockeryArray[counter++] = new Cup(maxCapacity, speed);
        } else {
            System.out.println("There is no place remained!");
        }
    }

    public void showInfo() {
        System.out.println("We have got " + counter + " vessels:");
        for (int i = 0; i < counter; i++) {
            System.out.printf("%d) %s, filled to %d out of %d milliliters.\n",
                    i + 1, crockeryArray[i].crockeryType, crockeryArray[i].currentVolume, crockeryArray[i].maxCapacity);
        }
        System.out.printf("%f seconds have passed.\n", time);
    }

    public void fillUp(int index, int volume) {
        if (index >= 0 && index < counter) {
            time += crockeryArray[index].fillUp(volume);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void pourOut(int index, int volume) {
        if (index >= 0 && index < counter) {
            time += crockeryArray[index].pourOut(volume);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
