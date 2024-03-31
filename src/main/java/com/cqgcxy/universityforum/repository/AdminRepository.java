package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    Admin findAdminByAdminLoginNameAndAdminLoginPassword(String username,String password);
}
