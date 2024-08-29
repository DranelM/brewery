package springframework.brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springframework.brewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("John Doe")
            .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
//        todo impl - would add a real impl to update customer
        log.debug("Updating a customer...");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
//        todo impl - would delete a real impl to delete customer
        log.debug("Deleting a customer...");
    }
}
