package com.itfbgroup.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping("{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable ("customerId") Long customerId){
           boolean isFraudulentCustomer = fraudCheckService.ifFraudulentCustomer(customerId);
           log.info("fraud check request for customer {}",customerId);
           return new FraudCheckResponse(isFraudulentCustomer);
    }
}
