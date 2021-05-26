package by.artezio.saladkou.behavioral.responsibilitychain.ilness;

public class Illness {

    private IllnessType title;
    private  double value;


    public Illness(IllnessType title, double value) {
        this.title = title;
        this.value = value;
    }

    public IllnessType getTitle() {
        return title;
    }

    public double getValue() {
        return value;
    }
}
