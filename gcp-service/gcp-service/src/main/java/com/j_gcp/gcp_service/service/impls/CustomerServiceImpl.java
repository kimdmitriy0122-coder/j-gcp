package com.j_gcp.gcp_service.service.impls;

import com.j_gcp.gcp_service.dto.ResponseDto;
import com.j_gcp.gcp_service.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public ResponseEntity<ResponseDto> addNewCustomer() {
        return null;
    }

    @Override
    public ResponseEntity<ResponseDto> getCustomerById(String customerId) {
        return null;
    }
}
