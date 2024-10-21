package com.product.collabart.mapper;

import com.product.collabart.dto.request.UserRequest;
import com.product.collabart.dto.response.UserResponse;
import com.product.collabart.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper2 {

    UserMapper2 INSTANCE= Mappers.getMapper(UserMapper2.class);

    UserResponse userToUserResponse(UserEntity user);
    UserEntity userRequestToUser(UserRequest userRequest);
}
