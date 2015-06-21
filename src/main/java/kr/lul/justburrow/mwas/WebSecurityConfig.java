package kr.lul.justburrow.mwas;

import kr.lul.justburrow.mwas.api.web.IndexApi;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <A>WebSecurityConfigurerAdapter
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable();
    http.authorizeRequests().antMatchers(IndexApi.C.API, IndexApi.C.API + "/*").permitAll();
  }
}
