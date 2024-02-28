import HomeWork8.FileData;
import HomeWork8.FileNavigator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeWork8_test {
    @Test
    public void test_addFile() {
        FileNavigator fileNavigator = new FileNavigator();
        List<FileData> newFile = new ArrayList<>();
        newFile.add(new FileData("/root/Dir1/", "my_file.txt", 3));
        fileNavigator.getFilesList().put("/root/Dir1/", newFile);
        fileNavigator.addFile(new FileData("/root/Dir1/", "my_file5.txt", 8));
        fileNavigator.addFile(new FileData("/root/Dir1/", "my_file1.txt", 1));
        fileNavigator.addFile(new FileData("/root/Dir2/", "my_file.txt", 10));
        fileNavigator.addFile(new FileData("/root/Dir1/", "my_file.txt", 4));
        fileNavigator.addFile(new FileData("/root/Dir2/", "my_file2.txt", 6));
        fileNavigator.addFile(new FileData("/root/Dir2/", "my_file3.txt", 15));
        fileNavigator.addFile(new FileData("/root/Dir3/", "new file.txt", 7));

        fileNavigator.getFilesList().forEach((path, file) -> file.forEach((fileData ->
                System.out.println(fileData.getFilePath() + fileData.getFileName()))));

        System.out.println();

        List<FileData> innerFiles = fileNavigator.findPath("/root/Dir1/");
        innerFiles.forEach((fileData -> System.out.println(fileData.getFileName())));

        System.out.println();

        List<FileData> sizeFilterredList = fileNavigator.filterBySize(10);
        sizeFilterredList.forEach((fileData -> System.out.println(fileData.getFilePath() +
                fileData.getFileName() + ", Size: " + fileData.getFileSize_bytes() + " bytes")));

        System.out.println();

        fileNavigator.removeFilesByPath("/root/Dir3/");

        fileNavigator.getFilesList().forEach((path, file) -> file.forEach((fileData ->
                System.out.println(fileData.getFilePath() + fileData.getFileName()))));

        System.out.println();

        List<FileData> sortedList = fileNavigator.sortBySize();

        sortedList.forEach((file) ->
                System.out.println(file.getFilePath() + file.getFileName() + ", Size: " + file.getFileSize_bytes()));
    }
}
