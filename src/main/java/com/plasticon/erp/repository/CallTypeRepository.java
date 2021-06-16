package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CallType;
@Repository
public interface CallTypeRepository extends JpaRepository<CallType,Number> {

}
