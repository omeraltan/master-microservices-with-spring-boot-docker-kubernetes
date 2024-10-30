package com.omer.accounts.repository;

import com.omer.accounts.entity.Accounts;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    
    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}

/**
 * 
 * Bu Anotasyonların Repository Sınıfında Kullanılma Nedeni
 * 
    Repository sınıfında @Transactional ve @Modifying anotasyonlarının kullanılması şu durumlarda uygun olabilir:
    1. Doğrudan Veri İşlemi Gerektiren Metotlar: Repository'de tanımlanan deleteByCustomerId gibi doğrudan veri silen veya güncelleyen işlemler, işlem (transaction) özelliklerine ihtiyaç duyar. Bu nedenle @Transactional ile işlem yönetimi sağlanır.
    2. Basit Veri İşlemleri İçin: Sadece bir veritabanı işlemi varsa, service katmanına çıkarmak yerine bu işlemi doğrudan repository katmanında yapmak sade bir yapı sağlar. Bu durumda, @Transactional ve @Modifying anotasyonlarını repository’de kullanmak, daha performanslı ve sade bir yapı sağlar.
    3. Spring Data JPA'nın Sağladığı Kolaylıklar: Spring Data JPA, repository içinde işlemleri kolayca tanımlamamıza olanak tanır. Eğer işlem service sınıfında gereksiz derecede basit bir görev üstleniyorsa, bu anotasyonları repository’de kullanmak kabul edilebilir.
 * 
 */