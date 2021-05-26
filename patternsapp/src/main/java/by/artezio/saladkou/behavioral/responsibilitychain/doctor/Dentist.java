package by.artezio.saladkou.behavioral.responsibilitychain.doctor;

import by.artezio.saladkou.behavioral.responsibilitychain.Conscript;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.Illness;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.IllnessType;

public class Dentist extends Doctor {

    private static final int MAX_ILL_TEETH_AMOUNT = 8;

    @Override
    public boolean checkIsAbleToServe(Conscript conscript) {
        for (Illness illness : conscript.getIllnesses()) {
            if (illness.getTitle().equals(IllnessType.CARIES)) {
                if (illness.getValue() >= MAX_ILL_TEETH_AMOUNT) {
                    conscript.setAbleToServe(false);
                    return false;
                }
            }
        }
        return super.checkIsAbleToServe(conscript);
    }
}
