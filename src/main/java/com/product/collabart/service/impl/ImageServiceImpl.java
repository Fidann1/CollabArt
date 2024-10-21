package com.product.collabart.service.impl;
import com.product.collabart.dto.request.ImageRequest;
import com.product.collabart.dto.response.ImageResponse;
import com.product.collabart.entity.ImageEntity;
import com.product.collabart.mapper.ImageMapper;
import com.product.collabart.repository.ImageRepository;
import com.product.collabart.service.inter.ImageInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageImpl implements ImageInter {

    private final ImageRepository imageRepository;


    @Override
    public List<ImageResponse> getAllImages() {
        return imageRepository.findAll().stream().map(ImageMapper.IMAGE_MAPPER::toImageResponse).toList();
    }

    @Override
    public ImageResponse getImageById(Long id) {
        return imageRepository.findById(id).map(ImageMapper.IMAGE_MAPPER::toImageResponse).orElse(null) ;
    }

    @Override
    public String saveImage(ImageRequest image , MultipartFile multipartFile) {
        return "Image is saved successfully";
    }

    @Override
    public void deleteImage(Long id) {

    }
}
