package com.j_gcp.gcp_service.service;

import com.j_gcp.gcp_service.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    public ResponseEntity<ResponseDto> addNewCustomer();
    public ResponseEntity<ResponseDto> getCustomerById(String customerId);

}
