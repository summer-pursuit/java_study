package org.example.config;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
@EnableMethodSecurity
@EnableWebSecurity   //开启WebSecurity相关功能
public class SecurityConfiguration {
    @Bean
    public PasswordEncoder passwordEncoder(){
        System.out.println(new BCryptPasswordEncoder().encode("password"));
        return new BCryptPasswordEncoder();
    }
    @Bean
    public DataSource dataSource(){
        //数据源配置
        return new PooledDataSource("com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:3306/study", "root", "123456");
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean;
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           PersistentTokenRepository repository) throws  Exception{
        return http
                .authorizeHttpRequests(auth->{
                    auth.requestMatchers("/static/**").permitAll();
                    auth.anyRequest().authenticated();//依然所有
                })
                .formLogin(conf->{
                    conf.loginPage("/login");
                    conf.loginProcessingUrl("/dologin");
                    conf.defaultSuccessUrl("/");
                    conf.permitAll();
                    conf.usernameParameter("username");
                    conf.passwordParameter("password");
                })
                .logout(conf->{
                    conf.logoutUrl("/dologout");
                    conf.logoutSuccessUrl("/login");
                    conf.permitAll();
                })
                .csrf(AbstractHttpConfigurer::disable)
                .rememberMe(conf->{
                    conf.tokenRepository(repository);

                })
                .build();
    }
    @Bean
    public PersistentTokenRepository tokenRepository(DataSource dataSource){
        JdbcTokenRepositoryImpl repository = new JdbcTokenRepositoryImpl();
//        //在启动时自动在数据库中创建存储记住我信息的表，仅第一次需要，后续不需要
//        repository.setCreateTableOnStartup(true);
        repository.setDataSource(dataSource);
        return repository;
    }




}