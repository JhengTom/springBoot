package com.jhengtom.springboot03logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	void contextLoads() {
		// 1.下面定義的日誌級別 trace < debug < info < warn < error
		// 2.SpringBoot默認的級別是info(也稱為root級別)
		// 3.透過properties可修級別，如果是debug，就不會印出trace，只會印出大於debug的

		// 跟蹤運行訊息
		logger.trace("這是trace日誌訊息");
		// 調適訊息
		logger.debug("這是debug日誌訊息");
		// 自定義訊息
		logger.info("這是info日誌訊息");
		// 警告訊息
		logger.warn("這是warn日誌訊息");
		// 錯誤訊息
		logger.error("這是error日誌訊息");

	}

}
