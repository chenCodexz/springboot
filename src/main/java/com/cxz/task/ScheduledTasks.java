package com.cxz.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduledTasks {
//    @Scheduled(fixedRate = 3000)
    @Scheduled(cron = "1/2 * * * * ? ")
    public void taskService(){
        log.info("<<定时任务执行>>"+System.currentTimeMillis());
    }
}
