package com.example.Expense.Tracker.authservice.repository;
import com.example.Expense.Tracker.authservice.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long>
{
    public UserInfo findByUsername(String username);
}