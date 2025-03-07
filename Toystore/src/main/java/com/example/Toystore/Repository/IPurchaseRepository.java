package com.example.Toystore.Repository;

import com.example.Toystore.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPurchaseRepository extends JpaRepository<Purchase,Long> {
}
