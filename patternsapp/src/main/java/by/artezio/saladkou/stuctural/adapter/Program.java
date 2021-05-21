package by.artezio.saladkou.stuctural.adapter;

public class Program {

    public static void main(String[] args) {
        //Car car = new PlaneToCarAdapter(new Tu134());
        Car car = new Fiat();
        car.pressGasPedal();
        car.moveSteamingWheel(50.0);
        car.pressBreakPedal();
    }
}
