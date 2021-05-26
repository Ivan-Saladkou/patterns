package by.artezio.saladkou.behavioral.responsibilitychain;

import by.artezio.saladkou.behavioral.responsibilitychain.ilness.Illness;
import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conscript {

    private boolean isAbleToServe = true;
    private List<Illness> illnesses = new ArrayList<>();

    public void addIllness(Illness illness) {
        illnesses.add(illness);
    }

    public List<Illness> getIllnesses() {
        return Collections.unmodifiableList(illnesses);
    }

    public boolean isAbleToServe() {
        return isAbleToServe;
    }

    public void setAbleToServe(boolean ableToServe) {
        isAbleToServe = ableToServe;
    }
}
