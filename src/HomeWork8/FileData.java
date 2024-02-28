package HomeWork8;

public class FileData implements Comparable<FileData>{
    private String filePath;
    private String fileName;
    private int fileSize_bytes;

    public FileData(String filePath, String fileName, int fileSize_bytes) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.fileSize_bytes = fileSize_bytes;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getFileSize_bytes() {
        return fileSize_bytes;
    }

    @Override
    public int compareTo(FileData o) {
        return this.fileSize_bytes - o.getFileSize_bytes();
    }
}
