package com.example.Toystore.Service;

import com.example.Toystore.model.Purchase;

import java.util.List;
import java.util.Optional;

public interface IpurchaseService {
    public Purchase savePurchase(Purchase purchase);
    public List<Purchase> getAllPurchases();
    public Optional<Purchase> getPurchaseById(Long id);
    public void deletePurchase(Long id);
}
