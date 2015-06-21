package kr.lul.justburrow.mwas.api.web.controller;

import kr.lul.justburrow.mwas.dao.BootLogDao;
import kr.lul.justburrow.mwas.domain.BootLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
class IndexControllerImpl implements IndexController {
  @Autowired
  private BootLogDao bootLogDao;

  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <I>IndexApi
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public ModelAndView index(ModelAndView mav) {
    BootLog current = bootLogDao.current();
    mav.setViewName(Template.INDEX);
    mav.addObject(M.TIMESTAMP, System.currentTimeMillis());
    mav.addObject(M.BOOT_LOG, current);
    return mav;
  }
}
