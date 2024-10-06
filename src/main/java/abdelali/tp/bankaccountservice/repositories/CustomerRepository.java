package abdelali.tp.bankaccountservice.repositories;

import abdelali.tp.bankaccountservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
