package com.sanjin.springbootinit.config;

import com.zhipu.oapi.ClientV4;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: yidada-backend
 * @BelongsPackage: com.sanjin.springbootinit.config
 * @Author: San Jin
 * @CreateTime: 2024-07-09 20:41
 * @Version: 1.0
 */

@Configuration
@ConfigurationProperties(prefix = "ai")
@Data
public class AiConfig {

    private String apiKey;

    @Bean
    public ClientV4 getClientV4(){
       return new ClientV4.Builder(apiKey).build();
    }

}
