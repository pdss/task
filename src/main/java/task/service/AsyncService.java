package task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author luotao
 * @date 2018/11/6-22:22
 */
@Service
public class AsyncService {
    @Async
    public void test(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据处理中 ");
    }
}
