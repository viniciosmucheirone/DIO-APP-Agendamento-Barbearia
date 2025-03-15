package me.dio.barbershop.mapper;

import me.dio.barbershop.controller.request.SaveClientRequest;
import me.dio.barbershop.controller.request.UpdateClientRequest;
import me.dio.barbershop.controller.response.ClientDetailResponse;
import me.dio.barbershop.controller.response.ListClientResponse;
import me.dio.barbershop.controller.response.SaveClientResponse;
import me.dio.barbershop.controller.response.UpdateClientResponse;
import me.dio.barbershop.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
