package kr.lul.justburrow.mwas.dao;

import kr.lul.justburrow.mwas.domain.BootLog;
import kr.lul.justburrow.mwas.domain.entity.BootLogEntity;
import kr.lul.justburrow.mwas.domain.repository.BootLogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class BootLogDaoImpl implements BootLogDao {
  @Autowired
  private BootLogRepository bootLogRepository;

  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <I>BootLogDao
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public BootLog current() {
    BootLogEntity log = bootLogRepository.findTopByOrderByIdDesc();
    return log;
  }
}
