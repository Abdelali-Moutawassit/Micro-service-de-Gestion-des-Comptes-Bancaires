package abdelali.tp.bankaccountservice.web;

import abdelali.tp.bankaccountservice.dto.BankAccountRequestDTO;
import abdelali.tp.bankaccountservice.dto.BankAccountResponseDTO;
import abdelali.tp.bankaccountservice.entities.BankAccount;
import abdelali.tp.bankaccountservice.entities.Customer;
import abdelali.tp.bankaccountservice.repositories.BankAccountRepository;
import abdelali.tp.bankaccountservice.repositories.CustomerRepository;
import abdelali.tp.bankaccountservice.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQLController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private CustomerRepository customerRepository;

    @QueryMapping
    public List<BankAccount> accountsList() {
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount bankAccountById(@Argument String id) {
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Bank account not found"));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount) {
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id,@Argument BankAccountRequestDTO bankAccount) {
        return accountService.updateAccount(id,bankAccount);
    }

    @MutationMapping
    public Boolean deleteAccount(@Argument String id) {
        bankAccountRepository.deleteById(id);
        return true;
    }

    @QueryMapping
    public List<Customer> customers(){
        return customerRepository.findAll();
    }
}



//la meme chose que class
/*
record BankAccountDTO(Double balance ,String type ,String currency){

}
 */