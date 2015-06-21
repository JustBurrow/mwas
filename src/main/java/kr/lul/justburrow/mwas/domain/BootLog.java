package kr.lul.justburrow.mwas.domain;

/**
 * 서버 기동 기록.
 *
 * @author JB 2015/06/21
 */
public interface BootLog {
  public int getId();

  public long getTimestampUtc();
}
