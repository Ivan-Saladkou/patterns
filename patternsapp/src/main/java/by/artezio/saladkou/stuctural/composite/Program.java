package by.artezio.saladkou.stuctural.composite;

public class Program {

    public static void main(String[] args) {
        Folder root = new Folder();
        Folder music = new Folder();
        Folder photos = new Folder();

        root.addContent(music);
        root.addContent(photos);

        File track = new File(10);
        File track2 = new File(15);
        Folder classic = new Folder();
        classic.addContent(new File(12));

        music.addContent(track);
        music.addContent(track2);
        music.addContent(classic);

        File image = new File(20);
        File image2 = new File(22);
        photos.addContent(image);
        photos.addContent(image2);

        System.out.println(root.getSize());
    }
}
