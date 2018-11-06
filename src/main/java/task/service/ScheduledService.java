package task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author luotao
 * @date 2018/11/6-22:33
 */
@Service
public class ScheduledService {
    @Scheduled(cron = "0 * * * * MON-SAT")
    public void test(){
        System.out.println("hello...");
    }
}
