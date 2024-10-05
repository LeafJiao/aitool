package com.aitool.artifact.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(scanBasePackages = {
        "com.aitool.artifact.boot", "com.aitool.infrast.artifact"
})
@EnableTransactionManagement
public class AitoolArtifactBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AitoolArtifactBootApplication.class, args);
    }

}
