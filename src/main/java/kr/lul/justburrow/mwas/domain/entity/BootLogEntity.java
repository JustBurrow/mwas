package kr.lul.justburrow.mwas.domain.entity;

import static kr.lul.justburrow.mwas.domain.entity.BootLogEntity.Entity.ENTITY;
import static kr.lul.justburrow.mwas.domain.entity.BootLogEntity.Table.TABLE;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import kr.lul.justburrow.mwas.domain.BootLog;

@Entity(name = ENTITY)
@Table(name = TABLE)
public class BootLogEntity implements BootLog {
  public static final class Entity {
    public static final String ENTITY        = "BootLog";

    public static final String ID            = "id";
    public static final String TIMESTAMP_UTC = "timestampUtc";

    private Entity() {
    }
  }

  public static final class Table {
    public static final String TABLE         = "boot_log";

    public static final String ID            = Entity.ID;
    public static final String TIMESTAMP_UTC = Entity.TIMESTAMP_UTC;

    private Table() {
    }
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, insertable = false, updatable = false)
  private int  id;

  @Column(nullable = false, updatable = false)
  private long timestampUtc;

  @PrePersist
  private void prePersist() {
    timestampUtc = Instant.now().toEpochMilli();
  }

  // //////////////////////////////////////////////////////////////////////////////////////////////
  // <I>BootLog
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public int getId() {
    return id;
  }

  @Override
  public long getTimestampUtc() {
    return timestampUtc;
  }

  // //////////////////////////////////////////////////////////////////////////////////////////////
  // Object
  // //////////////////////////////////////////////////////////////////////////////////////////////
  @Override
  public int hashCode() {
    return id;
  }

  @Override
  public boolean equals(Object obj) {
    if (0 < id && null != obj && obj instanceof BootLogEntity) {
      return id == ((BootLogEntity) obj).id;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return new StringBuilder(BootLogEntity.class.getSimpleName()).append("[id=").append(id)
        .append(", timestampUtc=").append(timestampUtc).append(']').toString();
  }
}
