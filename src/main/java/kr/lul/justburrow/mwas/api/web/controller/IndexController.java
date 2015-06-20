package kr.lul.justburrow.mwas.api.web.controller;

import kr.lul.justburrow.mwas.api.web.IndexApi;

import org.springframework.stereotype.Controller;

@Controller
class IndexController implements IndexApi {
  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <I>IndexApi
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public String index() {
    return V.INDEX;
  }
}
