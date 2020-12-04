package com.example.SimpleDataRest.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "brief", types = { Member.class })
public interface BriefProjection {

    @Value("#{target.name} : #{target.age}")
    String getBrief();
}
