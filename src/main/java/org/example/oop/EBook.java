public class EBook extends Book
{
     private String fileSize;

     public EBook(String title, String author, String fileSize)
     {
        super(title, author);
        this.fileSize = fileSize;
     }

     public String getFileSize()
     {
        return fileSize;
     }
}