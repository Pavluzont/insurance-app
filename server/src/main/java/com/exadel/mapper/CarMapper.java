package com.exadel.mapper;
import com.exadel.dto.CarDto;
import com.exadel.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToCarDto(Car car);

    Car carDtoToCar(CarDto carDto);
}
