package com.lhl.chapter4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by lunhengle on 2016/8/30.
 */
@Configuration
@Import({CustomerConfig.class,SchedulerConfig.class})
public class AppConfig {
}
