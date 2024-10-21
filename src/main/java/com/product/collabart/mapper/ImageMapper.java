package com.product.collabart.mapper;
import com.product.collabart.dto.request.ImageRequest;
import com.product.collabart.dto.response.ImageResponse;
import com.product.collabart.entity.ImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImageMapper2 {
    ImageMapper2 INSTANCE= Mappers.getMapper(ImageMapper2.class);

    ImageResponse toResponse(ImageEntity image);
    ImageEntity toEntity(ImageRequest imageRequest);

}
