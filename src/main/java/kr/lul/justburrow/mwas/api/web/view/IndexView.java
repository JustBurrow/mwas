package kr.lul.justburrow.mwas.api.web.view;

public class IndexView {
  private long timestampUtc;

  public long getTimestampUtc() {
    return timestampUtc;
  }

  public void setTimestampUtc(long utc) {
    this.timestampUtc = utc;
  }

  // //////////////////////////////////////////////////////////////////////////////////////////////
  // Object
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public String toString() {
    return new StringBuilder(IndexView.class.getSimpleName()).append("[timestampUtc=")
        .append(timestampUtc).append(']').toString();
  }
}
