//package com.test.config;
//
//import com.microsoft.azure.spring.data.cosmosdb.repository.config.EnableDocumentDbRepositories;
//import lombok.Getter;
//import lombok.Setter;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//
//
//@Configuration
//@EnableDocumentDbRepositories(basePackages = "com.test.dao.elasticsearch")
//@ConfigurationProperties(prefix = "elasticsearch")
//@Getter
//@Setter
//public class ESConfig {
//
//    private String host;
//    private String clusterName;
//    private Integer port;
//
//    @Bean
//    public TransportClient client() throws UnknownHostException {
//        InetSocketTransportAddress node = new InetSocketTransportAddress(
//                InetAddress.getByName(host),
//                port);
//
//        Settings settings = Settings.builder()
//                .put("cluster.name", clusterName)
//                .build();
//
//        TransportClient client = new PreBuiltTransportClient(settings);
//        client.addTransportAddress(node);
//
//        return client;
//    }
//}