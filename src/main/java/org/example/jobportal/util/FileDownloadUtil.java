package org.example.jobportal.util;

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloadUtil {
    // Path to the found file
    private Path foundFile;

    // Get the file as a UrlResource
    public UrlResource getFileAsResource(String downloadDir, String fileName) throws IOException {

        // convert the downloadDir to a Path object
        Path path = Paths.get(downloadDir);
        // iterate through the files in the directory and find the file that starts with the fileName
        Files.list(path).forEach(file -> {
            if (file.getFileName().toString().startsWith(fileName)) {
                foundFile = file;
            }
        });

        if (foundFile != null) {
            return new UrlResource(foundFile.toUri());
        }
        return null;
    }
}
