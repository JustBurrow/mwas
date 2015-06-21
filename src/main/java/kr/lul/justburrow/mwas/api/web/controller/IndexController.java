package kr.lul.justburrow.mwas.api.web.controller;

import kr.lul.justburrow.mwas.api.web.IndexApi;
import kr.lul.justburrow.mwas.api.web.view.IndexView;

import org.springframework.stereotype.Controller;

@Controller
class IndexController implements IndexApi {
  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <I>IndexApi
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public IndexView index() {
    IndexView view = new IndexView();
    view.setTimestampUtc(System.currentTimeMillis());
    return view;
  }
}
