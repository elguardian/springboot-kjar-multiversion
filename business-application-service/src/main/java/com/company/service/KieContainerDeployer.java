package com.company.service;

import java.util.Arrays;

import org.kie.server.api.KieServerConstants;
import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.KieServerConfigItem;
import org.kie.server.api.model.ReleaseId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.kie.server.api.model.KieContainerStatus.STARTED;

@Configuration
public class KieContainerDeployer {

    @Bean
    public KieContainerResource evaluation_v1() {
        KieContainerResource container = new KieContainerResource("evaluation_v1", new ReleaseId("com.myspace", "Evaluation", "1.0.0-SNAPSHOT"), STARTED);
        container.setConfigItems(Arrays.asList(new KieServerConfigItem(KieServerConstants.PCFG_RUNTIME_STRATEGY, "PER_PROCESS_INSTANCE", "String")));
        return container;
    }

    @Bean
    public KieContainerResource evaluation_v2() {
        KieContainerResource container = new KieContainerResource("evaluation_v2", new ReleaseId("com.myspace", "Evaluation", "2.0.0-SNAPSHOT"), STARTED);
        container.setConfigItems(Arrays.asList(new KieServerConfigItem(KieServerConstants.PCFG_RUNTIME_STRATEGY, "PER_PROCESS_INSTANCE", "String")));
        return container;
    }

}
