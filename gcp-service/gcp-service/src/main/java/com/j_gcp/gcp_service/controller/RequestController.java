package com.j_gcp.gcp_service.controller;

import com.j_gcp.gcp_service.dto.RequestDto;
import com.j_gcp.gcp_service.dto.ResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers/")
public class RequestController {
    @PostMapping("/addingNew")
    public ResponseEntity<ResponseDto> addNewCustomer(@Valid RequestDto requestDto) {
        return ResponseEntity.accepted().build();
    }
}
