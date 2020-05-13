package com.conversions.conversions.aop.api.advise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeTrackerAdvise {

    Logger logger = LoggerFactory.getLogger(ExecutionTimeTrackerAdvise.class);

    @Around("@annotation(com.conversions.conversions.aop.api.advise.TrackExecutionTime)")
    public Object trackTime(ProceedingJoinPoint pjp) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed;
        long endTime = System.currentTimeMillis();
        logger.info("Method Name " + pjp.getSignature() + "Executed in: " + (endTime - startTime));
        return obj;
    }
}
