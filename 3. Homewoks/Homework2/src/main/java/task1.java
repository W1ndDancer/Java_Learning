import java.io.File;

public class task1 {
    public static void main(String[] args) {
        File f = new File("/Users/wind/Desktop");
        String[] ext = f.list();
        if (ext == null)
            System.out.println("Repository not exist");
        else
            for (String pathname : ext){
                int ind = pathname.lastIndexOf(".");
                if (ind > 0) System.out.println("File extension: " + pathname.substring(ind + 1));
            }
    }
}
