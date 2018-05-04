package kosta.di;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {
	private Log log = LogFactory.getLog(getClass());

	// 공통관심메서드
	// when => advice :around
	public Object logging(ProceedingJoinPoint jointPoint) throws Throwable {
		log.info("로그시작");
		StopWatch stopWatch = new StopWatch();

		try {
			stopWatch.start();

			Object obj = jointPoint.proceed();// 핵심관심로직 호출(insert())
			return obj;

		} catch (Exception e) {
			throw e;
		} finally {
			stopWatch.stop();
			log.info("로그종료");
			log.info(jointPoint.getSignature().getName() + " 메서드 실행시 " + stopWatch.getTotalTimeMillis());
		}

	}
}
