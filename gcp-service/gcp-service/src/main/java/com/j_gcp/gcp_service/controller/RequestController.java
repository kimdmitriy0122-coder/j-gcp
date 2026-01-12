package com.j_gcp.gcp_service.controller;

import com.j_gcp.gcp_service.dto.GettingResponse;
import com.j_gcp.gcp_service.dto.RegisterRequest;
import com.j_gcp.gcp_service.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers/")
public class RequestController {
    private final CustomerService customerService;

    @PostMapping("/addingNew")
    public ResponseEntity<GettingResponse> addNewCustomer(@RequestBody @Valid RegisterRequest registerRequest) {
        GettingResponse response = customerService.addNewCustomer(registerRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GettingResponse> getCustomerById(@PathVariable Long id) {
        GettingResponse response = customerService.getCustomerById(id);
        return ResponseEntity.ok(response);
    }
}
