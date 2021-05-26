package by.artezio.saladkou.behavioral.responsibilitychain.doctor;

import by.artezio.saladkou.behavioral.responsibilitychain.Conscript;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.Illness;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.IllnessType;

public class Therapist extends Doctor {

    private static final int HIGHEST_BLOOD_PRESSURE = 150;

    @Override
    public boolean checkIsAbleToServe(Conscript conscript) {
        for (Illness illness : conscript.getIllnesses()) {
            if (illness.getTitle().equals(IllnessType.HIGH_BLOOD_PRESSURE)) {
                if (illness.getValue() >= HIGHEST_BLOOD_PRESSURE) {
                    conscript.setAbleToServe(false);
                    return false;
                }
            }
        }
        return super.checkIsAbleToServe(conscript);
    }

}
