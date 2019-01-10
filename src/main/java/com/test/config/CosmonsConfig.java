package com.test.config;

import com.microsoft.azure.spring.data.cosmosdb.config.AbstractDocumentDbConfiguration;
import com.microsoft.azure.spring.data.cosmosdb.config.DocumentDBConfig;
import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableDocumentDbRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@EnableDocumentDbRepositories(basePackages = "com.test.dao.cosmosdb")
@EnableConfigurationProperties(DocumentDbProperties.class)
@PropertySource("classpath:application.properties")
@Slf4j
public class CosmonsConfig extends AbstractDocumentDbConfiguration {
    @Autowired
    private DocumentDbProperties properties;

    @Override
    public DocumentDBConfig getConfig() {
        return DocumentDBConfig.builder(
                properties.getUri(),
                properties.getKey(),
                properties.getDatabase()
        ).build();
    }

}

