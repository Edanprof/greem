package io.jandy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.List;

/**
 * @author JCooky
 * @since 2015-07-08
 */
@Entity
public class ProfClass {
  @Id
  @GeneratedValue
  private long id;

  private String packageName = "";
  private String name = "";

  @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "owner")
  private List<ProfMethod> methods;

  public void setName(String name) {
    this.name = name != null ? name : "";
  }

  public String getName() {
    return name;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName != null ? packageName : "";
  }

  public String getPackageName() {
    return packageName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("name", name)
        .append("packageName", packageName)
        .append("id", id)
        .toString();
  }
}
