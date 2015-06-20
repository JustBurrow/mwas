package kr.lul.justburrow.mwas.api.web;

import kr.lul.justburrow.mwas.Application;
import kr.lul.justburrow.mwas.api.web.IndexApi.C;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 서버가 실행상태를 확인하기 위한 API.
 *
 * @author JB 2015/06/20
 */
@RequestMapping(C.API)
public interface IndexApi {
  /**
   * 뷰 상수.
   *
   * @author JB 2015/06/20
   */
  public static final class V {
    public static final String INDEX = "index";

    private V() {
    }
  }

  /**
   * 컨트롤러 상수.
   *
   * @author JB 2015/06/20
   */
  public static final class C {
    public static final String API   = Application.BASE_URI + "";

    public static final String INDEX = "";

    private C() {
    }
  }

  /**
   * 환영메시지.
   *
   * @author JB 2015/06/20
   * @return
   */
  @RequestMapping(C.INDEX)
  public String index();
}
