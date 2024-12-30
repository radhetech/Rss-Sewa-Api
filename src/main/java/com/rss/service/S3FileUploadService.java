package com.rss.service;

import java.io.IOException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class S3FileUploadService {

    @Autowired
    private AmazonS3 amazonS3;

    public URL uploadFile(String key, MultipartFile file) throws IOException {
        PutObjectRequest putObjectRequest = new PutObjectRequest("rss-upload-files", key, file.getInputStream(), null);
        amazonS3.putObject(putObjectRequest);
        return amazonS3.getUrl("rss-upload-files", key);
    }
}
