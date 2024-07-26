package org.sid.accounts;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AccountService {
    private AccountRepositoty accountRepositoty;

    public void create(Account account){
        this.accountRepositoty.save(account);
    }
    public List<Account> search(){
        return this.accountRepositoty.findAll();
    }
}
