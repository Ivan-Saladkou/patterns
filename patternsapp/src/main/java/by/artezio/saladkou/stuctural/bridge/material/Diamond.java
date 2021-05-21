package by.artezio.saladkou.stuctural.bridge.material;

import by.artezio.saladkou.stuctural.bridge.QualityLevel;

public class Diamond implements Material {

    public String getTitle() {
        return "diamond";
    }

    public QualityLevel getQualityLevel() {
        return QualityLevel.PERFECTLY;
    }
}
