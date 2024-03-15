package com.gduf.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Objects;

//定时任务实现类 在每天刷新剧本的平均分

@Component
public class RefreshScore {

//    此HashMap中
//    key表示scriptId，value表示剧本每天的平均分
//    springtask控制每天更新一次

    private HashMap<Integer, Integer> scoreHashMap;

    public RefreshScore() {
        if (Objects.isNull(scoreHashMap))
            this.scoreHashMap = new HashMap<>();
    }

    public HashMap<Integer, Integer> getScore() {
        return scoreHashMap;
    }

    //    corn表达式 每天执行一次
    @Scheduled(cron = "0 0 0 * * *")
    public void refreshScore() {
    }
}
