package com.andreymasiero.beverage.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.andreymasiero.beverage.model.Customer;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
        customerMap = new HashMap<>();
        UUID id = UUID.randomUUID();
        customerMap.put(id, Customer.builder()
                .id(id)
                .name("Jose")
                .version(1)
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build());

        id = UUID.randomUUID();
        customerMap.put(id, Customer.builder()
                .id(id)
                .name("Maria")
                .version(1)
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build());

        customerMap.put(id, Customer.builder()
                .id(UUID.fromString("024bd6cc-6605-4c58-8254-f200486b7afc"))
                .name("Gloria")
                .version(1)
                .createdOn(LocalDateTime.now())
                .updatedOn(LocalDateTime.now())
                .build());
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer findById(UUID id) {
        log.info("Service called for the customer | ID: {}", id);
        return customerMap.get(id);
    }
}
