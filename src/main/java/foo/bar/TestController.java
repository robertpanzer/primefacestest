package foo.bar;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.UUID;

@ViewScoped
@ManagedBean
public class TestController implements Serializable {


  private String id;

  @PostConstruct
  public void init() {
    this.id = UUID.randomUUID().toString();
  }

  public String getId() {
    return id;
  }
}
