package com.example.SimpleDataRest.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "only-name", types = {Member.class})
public interface OnlyName {

    String getName();
}
