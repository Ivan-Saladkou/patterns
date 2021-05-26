package by.artezio.saladkou.behavioral.responsibilitychain.doctor;

import by.artezio.saladkou.behavioral.responsibilitychain.Conscript;

public abstract class Doctor {

    protected Doctor nextDoctor;

    public void setNextDoctor(Doctor nextDoctor) {
        this.nextDoctor = nextDoctor;
    }

    public boolean checkIsAbleToServe(Conscript conscript) {
        if (nextDoctor != null) {
            return nextDoctor.checkIsAbleToServe(conscript);
        }
        return true;
    }
}
