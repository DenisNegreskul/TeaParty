import TeaParty.TeaParty;

public class Main {
    public static void main(String[] args) {
        TeaParty teaParty = new TeaParty(5);
        teaParty.addTeapot(3000, 150, .5);
        teaParty.addCup(500, 100);
        teaParty.addCup(250, 80);
        teaParty.addCup(300, 150);
        teaParty.addTeapot(1500, 100, .75);
        teaParty.addCup(200, 150);
        teaParty.showInfo();
        teaParty.pourOut(0, 1000);
        teaParty.fillUp(0, 800);
        teaParty.fillUp(7, 400);
        teaParty.pourOut(0, 800);
        teaParty.fillUp(0, 1800);
        teaParty.fillUp(0, 450);
        teaParty.fillUp(1, 900);
        teaParty.pourOut(1, 200);
        teaParty.fillUp(2, 200);
        teaParty.fillUp(3, 300);
        teaParty.pourOut(3, 500);
        teaParty.fillUp(4, 1200);
        teaParty.pourOut(4, 300);
        teaParty.showInfo();
    }
}
