package org.nabii.demofrog.repository;

import org.nabii.demofrog.entity.Frog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrogRepository extends JpaRepository<Frog, String> {
}
