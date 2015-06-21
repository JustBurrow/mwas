package kr.lul.justburrow.mwas.api.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
class IndexControllerImpl implements IndexController {
  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <I>IndexApi
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public ModelAndView index(ModelAndView mav) {
    mav.setViewName(Template.INDEX);
    mav.addObject(M.TIMESTAMP, System.currentTimeMillis());
    return mav;
  }
}
