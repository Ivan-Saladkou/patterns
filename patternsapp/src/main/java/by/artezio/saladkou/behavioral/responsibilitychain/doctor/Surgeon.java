package by.artezio.saladkou.behavioral.responsibilitychain.doctor;

import by.artezio.saladkou.behavioral.responsibilitychain.Conscript;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.Illness;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.IllnessType;

public class Surgeon extends Doctor {

    private double MAX_SCOLIOSIS_DEGREE = 30;

    @Override
    public boolean checkIsAbleToServe(Conscript conscript) {
        for (Illness illness : conscript.getIllnesses()) {
            if (illness.getTitle().equals(IllnessType.SCOLIOSIS)) {
                if (illness.getValue() >= MAX_SCOLIOSIS_DEGREE) {
                    conscript.setAbleToServe(false);
                    return false;
                }
            }
        }
        return super.checkIsAbleToServe(conscript);
    }

}
