package com.acme.orders;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jackson.autoconfigure.JsonMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderDeskApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderDeskApplication.class, args);
    }

    @Bean
    JsonMapperBuilderCustomizer moneyAsNumbers() {
        return builder -> builder.withConfigOverride(BigDecimal.class, override ->
            override.setFormat(JsonFormat.Value.forShape(JsonFormat.Shape.NUMBER)));
    }
}
