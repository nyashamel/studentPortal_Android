package com.example.studentportal_android.config;

import com.example.studentportal_android.controller.ControllerMarker;
import com.example.studentportal_android.domain.EntityMarker;
import com.example.studentportal_android.repository.RepositoryMarker;
import com.example.studentportal_android.service.ServiceMarker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration

@EntityScan(basePackageClasses = EntityMarker.class,
        basePackages = {"com.example.studentportal_android"}
)
@EnableJpaRepositories(
        basePackageClasses = {RepositoryMarker.class})
@ComponentScan(
        basePackageClasses = {
                EntityMarker.class,
                RepositoryMarker.class,
                ServiceMarker.class,
                ControllerMarker.class
        })
@RequiredArgsConstructor
public class PortalConfig {

}

