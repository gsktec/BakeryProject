package net.javaguidelines.bp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguidelines.bp.entity.Bakeryitem;

public interface BakeryRepository extends JpaRepository<Bakeryitem, Long>{

}
