package kr.lul.justburrow.mwas.dao;

import kr.lul.justburrow.mwas.domain.BootLog;

public interface BootLogDao extends DaoConfig {
  public BootLog current();
}
