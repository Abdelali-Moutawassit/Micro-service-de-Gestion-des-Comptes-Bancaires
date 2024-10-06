package abdelali.tp.bankaccountservice.service;

import abdelali.tp.bankaccountservice.dto.BankAccountRequestDTO;
import abdelali.tp.bankaccountservice.dto.BankAccountResponseDTO;
import abdelali.tp.bankaccountservice.entities.BankAccount;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
