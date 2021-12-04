package com.coursework.springBoot.core.model;


import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    @ApiModelProperty("ID записи")
    private long id;
    @ApiModelProperty("Имя")
    private String firstname;
    @ApiModelProperty("Фамилия")
    private String lastname;
    @ApiModelProperty("Отчетсво")
    private String surname;
}
