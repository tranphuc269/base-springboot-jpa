package com.phuc.basespringbootjpa.infrastructure.repo;

import com.phuc.basespringbootjpa.infrastructure.repo.model.JpaBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBookingRepository extends JpaRepository<JpaBooking, Long> {
}