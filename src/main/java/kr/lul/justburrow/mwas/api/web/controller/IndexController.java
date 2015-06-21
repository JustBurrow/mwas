package kr.lul.justburrow.mwas.api.web.controller;

import kr.lul.justburrow.mwas.api.web.IndexApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JB 2015/06/21
 */
@RequestMapping(IndexApi.API_GROUP)
public interface IndexController extends IndexApi {
  /**
   * HTML 템플릿 정보.
   *
   * @author JB 2015/06/21
   */
  public static final class Template {
    public static final String DIRECTORY = "index";

    public static final String INDEX     = Template.DIRECTORY + "/index";

    private Template() {
    }
  }

  /**
   * 템플릿에 넘겨줄 모델 어트리뷰트.
   *
   * @author JB 2015/06/21
   */
  public static final class M {
    public static final String TIMESTAMP = "timestamp";
    public static final String BOOT_LOG  = "bootLog";

    private M() {
    }
  }

  /**
   * @author JB 2015/06/21
   * @param mav
   * @return
   */
  @RequestMapping(IndexApi.INDEX)
  public ModelAndView index(ModelAndView mav);
}
