package com.zh.springbootmongodb.base.exception.handler;

import com.alibaba.fastjson.JSONObject;
import com.zh.springbootmongodb.base.aop.AppLogAspect;
import com.zh.springbootmongodb.entity.dto.Result;
import com.zh.springbootmongodb.base.exception.BusinessException;
import com.zh.springbootmongodb.service.AppVisitLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.Date;

/**
 * @author zhanghang
 * @date 2019/6/5
 */
@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {

    @Autowired
    private AppVisitLogService appVisitLogService;

    private void saveAppVisitLog(Result result){
        String uuid = AppLogAspect.REQUEST_UUID.get();
        Date responseTime = new Date();
        Long costTime = responseTime.getTime() - AppLogAspect.REQUEST_START_TIME.get();
        String responseContent = JSONObject.toJSONString(result);
        this.appVisitLogService.save(uuid,responseTime,costTime,responseContent,result.getCode());
    }

    @ExceptionHandler(BusinessException.class)
    public Result businessExceptionHandler(BusinessException ex){
        log.error("BusinessException异常信息：[{}]", ex.getMsg(),ex);
        Result result = Result.genFailResult(ex.getAppResultCode());
        this.saveAppVisitLog(result);
        return result;
    }

    @ExceptionHandler({MethodArgumentNotValidException.class,BindException.class})
    public Result bindingResultExceptionHandler(Exception ex){
        if(ex instanceof MethodArgumentNotValidException) {
            log.error("MethodArgumentNotValidException异常信息：[{}]", ex.getMessage(),ex);
        }else{
            log.error("BindException异常信息：[{}]", ex.getMessage(),ex);
        }
        Result result = Result.genFailResult(ex.getMessage());
        this.saveAppVisitLog(result);
        return result;
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public Result constraintViolationExceptionHandler(ConstraintViolationException ex){
        log.error("ConstraintViolationException异常信息：[{}]", ex.getMessage(),ex);
        Result result = Result.genFailResult(ex.getMessage());
        this.saveAppVisitLog(result);
        return result;
    }

    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(Exception ex){
        log.error("Exception异常信息：[{}]", ex.getMessage(),ex);
        Result result = Result.genFailResult(ex.getMessage());
        this.saveAppVisitLog(result);
        return result;
    }

}
