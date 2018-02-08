package com.fbart.research.web.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wangqisen on 2017/11/10.
 * <p>
 * biz请求logger
 */
@Aspect
@Component
public class BizLogger {

//    private static final Logger LOGGER = LoggerFactory.getLogger(BizRequestLogger.class);

    @Pointcut("execution(public * com.fbart.research.web.service.*.*(..))")
    public void bizMethodPoint() {
    }

    @Around("bizMethodPoint()")
    public Object logRequest(final ProceedingJoinPoint point) throws Throwable {
        String parameters = JSON.toJSONString(point.getArgs());

//        LOGGER.info("Request arguments:" + parameters);
        System.out.println(parameters);
        try {
            Object result = point.proceed();
//            LOGGER.info("Response:" + JSON.toJSONString(result));
            System.out.println("Response:" + JSON.toJSONString(result));
            return result;
        } catch (Exception e) {
//            LOGGER.error("Error when call method " + point.getSignature().getName() + ",Parameters:" + parameters, e);
            throw e;
        }
    }
}
