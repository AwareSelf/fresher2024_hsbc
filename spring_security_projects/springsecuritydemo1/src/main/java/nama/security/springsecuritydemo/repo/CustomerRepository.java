package nama.security.springsecuritydemo.repo;

import nama.security.springsecuritydemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    public Customer findByUsername(String username);
}
