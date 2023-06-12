package scheduler;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	@Scheduled(cron = "0/5 * * * * ?")
	public void autoInsert() {
		logger.info("5초마다 logger뽑기 : {}", new Date());
		logger.info("되나되나");
	}
	
}
