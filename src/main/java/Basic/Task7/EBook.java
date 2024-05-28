package Basic.Task7;

public class EBook extends Book {
    private float fileSize;

    public EBook(String title, String author, float fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public float getFileSize() {
        return fileSize;
    }

    public void setFileSize(float fileSize) {
        if (fileSize > 0) {
            this.fileSize = fileSize;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "EBook{" +
                "fileSize=" + fileSize +
                '}';
    }
}
