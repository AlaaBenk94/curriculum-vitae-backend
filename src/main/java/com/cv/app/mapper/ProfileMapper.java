package com.cv.app.mapper;

import com.cv.app.dto.ProfileDto;
import com.cv.app.model.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileDto profile2ProfileDto(Profile profile);
}
