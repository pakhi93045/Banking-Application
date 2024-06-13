package bank.first.banking.repository;

import bank.first.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Long>{

}
