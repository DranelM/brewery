package springframework.brewery.services;

import springframework.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID customerId);
}
