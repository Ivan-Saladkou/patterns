package by.artezio.saladkou.stuctural.composite;

public class File implements FileSystemComponent {

    private int size;

    public File(int size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
