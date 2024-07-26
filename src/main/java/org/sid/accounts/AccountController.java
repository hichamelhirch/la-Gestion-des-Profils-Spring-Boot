package org.sid.accounts;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountController {

private AccountService accountService;
 @PostMapping
    public void create(@RequestBody Account account){
    this.accountService.create(account);
}
 @GetMapping
    public List<Account> searchAll(){
     return this.accountService.search();
}
}
