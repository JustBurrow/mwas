package kr.lul.justburrow.mwas;

import kr.lul.justburrow.mwas.api.web.IndexApi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <A>WebMvcConfigurerAdapter
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController(IndexApi.C.API + IndexApi.C.INDEX).setViewName(IndexApi.V.INDEX);
  }
}
