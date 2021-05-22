package guru.springframework.dependencyinjectionexamples.config;

import guru.springframework.dependencyinjectionexamples.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Gowtham C on 22/05/21.
 */
@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

  @Bean
  FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
                                @Value("${guru.password}")String password,
                                @Value("${guru.jdbcurl}")String jdbcurl){

    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setJdbcurl(jdbcurl);
    fakeDataSource.setUsername(username);
    fakeDataSource.setPassword(password);

    return fakeDataSource;
  }
}
