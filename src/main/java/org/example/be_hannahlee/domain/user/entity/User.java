package org.example.be_hannahlee.domain.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "tbl_user")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "account_id", unique = true)
    String accountId;

    String password;

    @Builder
    User(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
    }

}


