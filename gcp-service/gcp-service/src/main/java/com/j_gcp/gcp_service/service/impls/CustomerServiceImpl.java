package com.j_gcp.gcp_service.service.impls;

import com.j_gcp.gcp_service.dto.RegisterRequest;
import com.j_gcp.gcp_service.dto.GettingResponse;
import com.j_gcp.gcp_service.entity.Customer;
import com.j_gcp.gcp_service.exceptions.CustomerNotFoundException;
import com.j_gcp.gcp_service.mapper.CustomerMapper;
import com.j_gcp.gcp_service.repository.CustomerRepository;
import com.j_gcp.gcp_service.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;
    private final CustomerMapper mapper;

    @Override
    @Transactional
    public GettingResponse addNewCustomer(final RegisterRequest registerRequest) {
        Customer entity = mapper.toEntity(registerRequest);
        repository.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public GettingResponse getCustomerById(Long customerId) {
        Customer customer = repository
            .findById(customerId)
            .orElseThrow(() -> new CustomerNotFoundException("Customer not found with id " + customerId));
        GettingResponse response = mapper.toDto(customer);
        return response;
    }
}
