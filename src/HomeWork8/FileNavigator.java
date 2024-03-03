package HomeWork8;

import java.util.*;

public class FileNavigator {
    Map<String, List<FileData>> filesList;

    public FileNavigator() {
        this.filesList = new HashMap<>();
    }

    public boolean addFile(FileData file) {
        String filePath = file.getFilePath();
        String fileName = file.getFileName();
        if (this.filesList.containsKey(filePath)) {
            for (FileData k : this.filesList.get(filePath)) {
                if (k.getFileName().equals(fileName)) return false;
                else {
                    filesList.get(filePath).add(file);
                    return true;
                }
            }
        }
//        ArrayList<FileData> newFile = new ArrayList<>();      //додавання нового шляху
//        newFile.add(file);
//        this.filesList.put(filePath, newFile);
//        return true;
        System.out.println("Такого шляху не існує. Файл не додано."); //помилка додавання файлу якщо шлях не існує
        return false;
    }

    public List<FileData> findPath(String path) {
        if (this.filesList.containsKey(path))
            return this.filesList.get(path);
        return null;
    }

    public List<FileData> filterBySize(int fileSize) {
        List<FileData> sizeFilterList = new ArrayList<>();
        this.filesList.forEach((path, file) -> {
            for (FileData k : file) {
                if (k.getFileSize_bytes() <= fileSize) sizeFilterList.add(k);
            }
        });
        return sizeFilterList;
    }

    public void removeFilesByPath(String removePath) {
        this.filesList.remove(removePath);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedList = new ArrayList<>();
        this.filesList.forEach((p, f) -> sortedList.addAll(f));
        Collections.sort(sortedList);
        return sortedList;
    }

    public Map<String, List<FileData>> getFilesList() {
        return this.filesList;
    }
}
