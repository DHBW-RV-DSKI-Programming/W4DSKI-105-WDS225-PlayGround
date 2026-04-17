package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileTaskApp {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("data", "content.txt");
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);

        String path2 = "data/content2.txt";
        String content2 = "Fortgeschrittene Programmierung\n";
        Path pathObj = Path.of(path2);
        if (!Files.exists(pathObj)) {
            Files.createFile(pathObj);
        }
        System.out.println(Files.exists(pathObj));
        Files.write(pathObj, content2.getBytes(), StandardOpenOption.APPEND);
    }


}
