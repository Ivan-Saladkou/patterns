package by.artezio.saladkou.stuctural.bridge.material;

import by.artezio.saladkou.stuctural.bridge.QualityLevel;

public class Gold implements Material {

    public String getTitle() {
        return "gold";
    }

    public QualityLevel getQualityLevel() {
        return QualityLevel.PRETTY_GOOD;
    }
}
