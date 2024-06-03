import java.io.File;

public class Files {
    public static void main(String[] args) {
        File file = new File("Gui.java");
        if(file.exists()){
            System.out.println("File exists lol :) ");
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());

        }
        else {
            System.out.println("File does not exist :( ");
        }
    }
}
