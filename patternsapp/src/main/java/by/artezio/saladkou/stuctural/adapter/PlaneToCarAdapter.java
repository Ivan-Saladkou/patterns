package by.artezio.saladkou.stuctural.adapter;

public class PlaneToCarAdapter implements Car {

    private Plane plane;

    public PlaneToCarAdapter(Plane plane) {
        this.plane = plane;
    }

    public void pressGasPedal() {
        plane.moveLeverArm(Plane.Direction.FORWARD);
    }

    public void pressBreakPedal() {
        plane.moveLeverArm(Plane.Direction.BACK);
    }

    public void moveSteamingWheel(double degree) {
        if (degree <= 0) {
            plane.moveLeverArm(Plane.Direction.LEFT);
        } else if (degree >= 0) {
            plane.moveLeverArm(Plane.Direction.RIGHT);
        } else {
            plane.moveLeverArm(Plane.Direction.FORWARD);
        }
    }
}
