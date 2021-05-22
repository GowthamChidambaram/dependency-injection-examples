package guru.springframework.dependencyinjectionexamples.datasource;

/**
 * Created by Gowtham C on 22/05/21.
 */
public class FakeDataSource {

  private String username;
  private String password;
  private String jdbcurl;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getJdbcurl() {
    return jdbcurl;
  }

  public void setJdbcurl(String jdbcurl) {
    this.jdbcurl = jdbcurl;
  }
}
