/*
import com.microsoft.azure.documentdb.internal.directconnectivity.TransportClient;
import lombok.Value;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.net.InetAddress;

*/
/**
 * @author vn0ow6b
 * @Title: ElasticSearchConfig
 * @Description: TODO
 * @date 2018/12/28 16:33
 *//*

@Configuration
@PropertySource(value={"classpath:elasticsearch.properties"}) // 加载 指定的配置，只支持properti
public class ElasticSearchConfig {


    @Value("${es.hostName}")
    private String hostName;

    @Value("${es.transport}")
    private Integer transport;

    @Value("${es.cluster.name}")
    private String clusterName;

    @Bean
    public TransportClient transportClient() {
       // LOGGER.info("初始化开始。。。。。");
        TransportClient client = null;
        try {
            TransportAddress transportAddress = new InetSocketTransportAddress(InetAddress.getByName(hostName),
                    Integer.valueOf(transport));

            // 配置信息
            Settings esSetting = Settings.builder()
                    .put("cluster.name",clusterName)
                    .build();

            //配置信息Settings自定义,下面设置为EMPTY
            client = new PreBuiltTransportClient(esSetting);

            client.addTransportAddresses(transportAddress);


        } catch (Exception e) {
            logger.error("elasticsearch TransportClient create error!!!", e);
        }

        return client;
    }
}*/
