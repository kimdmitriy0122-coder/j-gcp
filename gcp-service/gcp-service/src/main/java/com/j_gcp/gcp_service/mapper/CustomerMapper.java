package com.j_gcp.gcp_service.mapper;

import com.j_gcp.gcp_service.dto.GettingResponse;
import com.j_gcp.gcp_service.dto.RegisterRequest;
import com.j_gcp.gcp_service.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "passportDate", source = "registerRequest.passportDate")
    Customer toEntity(RegisterRequest registerRequest);
    @Mapping(target = "registrationDate", source = "customerEntity.registrationDate")
    GettingResponse toDto(Customer customerEntity);
}
