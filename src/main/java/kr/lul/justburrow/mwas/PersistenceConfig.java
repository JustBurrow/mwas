package kr.lul.justburrow.mwas;

import javax.sql.DataSource;

import kr.lul.justburrow.mwas.domain.entity.EntityAnchor;
import kr.lul.justburrow.mwas.domain.repository.RepositoryAnchor;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackageClasses = { RepositoryAnchor.class },
    transactionManagerRef = BeanConstants.TRANSACTION_MANAGER,
    entityManagerFactoryRef = BeanConstants.ENTITY_MANAGER_FACTORY)
@EnableTransactionManagement
public class PersistenceConfig {
  @Bean
  @ConfigurationProperties("mwas.datasource")
  public DataSource gameDataSource() {
    DataSource dataSource = DataSourceBuilder.create().build();
    return dataSource;
  }

  @Bean(name = BeanConstants.ENTITY_MANAGER_FACTORY)
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
    adapter.setShowSql(true);
    adapter.setGenerateDdl(true);
    adapter.setDatabase(Database.MYSQL);

    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
    factory.setDataSource(gameDataSource());
    factory.setJpaVendorAdapter(adapter);
    factory.setPackagesToScan(EntityAnchor.ENTITY_PACKAGE);
    factory.afterPropertiesSet();
    return factory;
  }

  @Bean(name = BeanConstants.TRANSACTION_MANAGER)
  public PlatformTransactionManager transactionManager() {
    JpaTransactionManager tm = new JpaTransactionManager(entityManagerFactory().getObject());
    return tm;
  }

  @Bean
  public HibernateExceptionTranslator hibernateExceptionTranslator() {
    return new HibernateExceptionTranslator();
  }
}
