package com.product.collabart.service.inter;

import com.product.collabart.dto.request.ImageRequest;
import com.product.collabart.dto.response.ImageResponse;
import com.product.collabart.entity.ImageEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageInter {
    List<ImageResponse> getAllImages();
    ImageResponse getImageById(Long id);
    String saveImage(ImageRequest image , MultipartFile multipartFile);
    void deleteImage(Long id);
}
