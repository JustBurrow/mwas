package kr.lul.justburrow.mwas.domain.repository;

import kr.lul.justburrow.mwas.domain.entity.BootLogEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootLogRepository extends JpaRepository<BootLogEntity, Long> {
}
