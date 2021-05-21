package by.artezio.saladkou.stuctural.adapter;

public class Fiat implements Car {

    public void pressGasPedal() {
        System.out.println("Fiat is moving");
    }

    public void pressBreakPedal() {
        System.out.println("Fiat is stopping");
    }

    public void moveSteamingWheel(double degree) {
        System.out.println("Fiat turn on " + degree + " degrees");
    }
}
