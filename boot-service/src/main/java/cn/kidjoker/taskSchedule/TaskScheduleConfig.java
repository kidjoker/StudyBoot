package cn.kidjoker.taskSchedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("cn.kidjoker.taskSchedule")
@EnableScheduling
public class TaskScheduleConfig {

}
