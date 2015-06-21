package kr.lul.justburrow.mwas.domain.repository;

import kr.lul.justburrow.mwas.domain.entity.BootLogEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author JB 2015/06/22
 */
@Repository
public interface BootLogRepository extends JpaRepository<BootLogEntity, Long> {
  /**
   * @author JB 2015/06/22
   * @return 마지막 기동 로그.
   */
  public BootLogEntity findTopByOrderByIdDesc();
}
