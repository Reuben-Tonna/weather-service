package com.noaa.ghcn.ghcnbrowser.config;

import org.apache.commons.net.ftp.FTPFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.file.remote.session.CachingSessionFactory;
import org.springframework.integration.file.remote.session.SessionFactory;
import org.springframework.integration.ftp.session.DefaultFtpSessionFactory;

@Configuration
public class FtpSessionFactory {

    @Bean
    public SessionFactory<FTPFile> noaaFtpSessionFactory(
            @Value("${application.noaa.ftp.host}") String noaaFtpHost,
            @Value("${application.noaa.ftp.port}") int port,
            @Value("${application.noaa.ftp.username}") String username,
            @Value("${application.noaa.ftp.password}") String password) {

        DefaultFtpSessionFactory sf = new DefaultFtpSessionFactory();
        sf.setHost(noaaFtpHost);
        sf.setPort(port);
        sf.setUsername(username);
        sf.setPassword(password);

        return new CachingSessionFactory<>(sf);
    }
}