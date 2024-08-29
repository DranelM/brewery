package springframework.brewery.services;

import org.springframework.stereotype.Service;
import springframework.brewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("John Doe")
                .build();
    }
}
