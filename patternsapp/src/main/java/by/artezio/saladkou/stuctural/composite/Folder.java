package by.artezio.saladkou.stuctural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private List<FileSystemComponent> content;

    public Folder() {
        content = new ArrayList<FileSystemComponent>();
    }

    public void addContent(FileSystemComponent item) {
        content.add(item);
    }

    public double getSize() {
        double sum = 0;
        for (FileSystemComponent component : content) {
            sum += component.getSize();
        }
        return sum;
    }
}
