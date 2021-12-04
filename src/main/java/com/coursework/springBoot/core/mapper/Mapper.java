package com.coursework.springBoot.core.mapper;

import com.coursework.springBoot.core.model.UserDto;
import com.coursework.springBoot.db.entity.user.UserEntity;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(UserEntity.class, UserDto.class)
                .byDefault()
                .register();
    }
}
