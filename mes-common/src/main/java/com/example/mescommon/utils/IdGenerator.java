package com.example.mescommon.utils;

import cn.hutool.core.lang.Snowflake;
import org.springframework.stereotype.Component;

@Component
public class IdGenerator {
    final Snowflake snowflake;

    public IdGenerator() {
        this.snowflake = new Snowflake(1, 1);
    }

    public long generateId() {
        return this.snowflake.nextId();
    }
}
