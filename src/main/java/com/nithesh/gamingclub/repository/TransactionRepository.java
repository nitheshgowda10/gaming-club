package com.nithesh.gamingclub.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nithesh.gamingclub.entities.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
List<Transaction> findTransactionByMemberId(int Member_id);
}