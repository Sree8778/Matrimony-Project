import java.io.File;
 
public class CreateDir{
     
    private static final String FOLDER ="F:\\nikos7\\Desktop\\testFiles\\newFolder";
 
    public static void main(String[] args) {
         
        File newFolder = new File(FOLDER);
         
        boolean created =  newFolder.mkdir();
         
        if(created)
            System.out.println("Folder was created !");
        else
            System.out.println("Unable to create folder");
    }
}
}