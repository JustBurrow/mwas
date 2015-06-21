package kr.lul.justburrow.mwas.dao;

import kr.lul.justburrow.mwas.domain.BootLog;
import kr.lul.justburrow.mwas.domain.entity.BootLogEntity;
import kr.lul.justburrow.mwas.domain.repository.BootLogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
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
    PageRequest spec = new PageRequest(0, 1, Direction.DESC, BootLogEntity.Entity.ID);
    BootLogEntity log = bootLogRepository.findAll(spec).getContent().get(0);
    return log;
  }
}
