package com.j_gcp.gcp_service.service;

import com.j_gcp.gcp_service.dto.GettingResponse;
import com.j_gcp.gcp_service.dto.RegisterRequest;

public interface CustomerService {
    public GettingResponse addNewCustomer(RegisterRequest registerRequest);
    public GettingResponse getCustomerById(Long customerId);
}
