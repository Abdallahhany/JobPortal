package org.example.jobportal.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    // Directory where uploaded files will be stored
    private static final String UPLOAD_DIR = "photos";

    // Expose directory
    @Override
    public void addResourceHandlers( ResourceHandlerRegistry registry) {
        // Expose the upload directory to be accessible via URL
        exposeDirectory(registry);
    }

    private void exposeDirectory(ResourceHandlerRegistry registry) {
        // Get the path to the upload directory
        Path path = Paths.get(MvcConfig.UPLOAD_DIR);
        // Register the upload directory as a resource handler
        registry.addResourceHandler("/" + MvcConfig.UPLOAD_DIR + "/**").addResourceLocations("file:" + path.toAbsolutePath() + "/");
    }
}
