package kr.lul.justburrow.mwas.dao;

import kr.lul.justburrow.mwas.domain.BootLog;

import org.springframework.transaction.annotation.Transactional;

public interface BootLogDao extends DaoConfig {
  @Transactional(readOnly = true)
  public BootLog current();
}
