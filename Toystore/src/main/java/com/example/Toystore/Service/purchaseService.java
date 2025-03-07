package com.example.Toystore.Service;

import com.example.Toystore.Repository.IPurchaseRepository;
import com.example.Toystore.exception.PurchaseNotFoundException; // Import the custom exception
import com.example.Toystore.model.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class purchaseService implements IpurchaseService {
    @Autowired
    private IPurchaseRepository iPurchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        return iPurchaseRepository.save(purchase);
    }

    @Override
    public List<Purchase> getAllPurchases() {
        return iPurchaseRepository.findAll();
    }

    @Override
    public Optional<Purchase> getPurchaseById(Long id) {
        return Optional.ofNullable(iPurchaseRepository.findById(id)
                .orElseThrow(() -> new PurchaseNotFoundException(id)));
    }

    @Override
    public void deletePurchase(Long id) {
        if (iPurchaseRepository.existsById(id)) {
            iPurchaseRepository.deleteById(id);
        } else {
            throw new PurchaseNotFoundException(id);
        }
    }
}
