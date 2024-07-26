package org.sid.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepositoty extends JpaRepository<Account,Long> {
}
