package by.artezio.saladkou.behavioral.responsibilitychain;

import by.artezio.saladkou.behavioral.responsibilitychain.doctor.Dentist;
import by.artezio.saladkou.behavioral.responsibilitychain.doctor.Doctor;
import by.artezio.saladkou.behavioral.responsibilitychain.doctor.Surgeon;
import by.artezio.saladkou.behavioral.responsibilitychain.doctor.Therapist;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.Illness;
import by.artezio.saladkou.behavioral.responsibilitychain.ilness.IllnessType;

public class Program {

    public static void main(String[] args) {
        Conscript conscript = new Conscript();
        conscript.addIllness(new Illness(IllnessType.CARIES, 5.0));
        conscript.addIllness(new Illness(IllnessType.MYOPIA, -2.5));
        conscript.addIllness(new Illness(IllnessType.SCOLIOSIS, 29));
        conscript.addIllness(new Illness(IllnessType.HIGH_BLOOD_PRESSURE, 120));


        Doctor therapist = new Therapist();
        Doctor dentist = new Dentist();
        Doctor surgeon = new Surgeon();


        therapist.setNextDoctor(surgeon);
        surgeon.setNextDoctor(dentist);
        therapist.checkIsAbleToServe(conscript);

        System.out.println(conscript.isAbleToServe());
    }
}
