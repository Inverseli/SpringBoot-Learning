package com.inverseli.learning.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.inverseli.learning.dto.ErrorInfo;

/**  
 * @date：2018年9月22日 下午7:46:57    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception",e);
		mav.addObject("url",req.getRequestURI());
		mav.setViewName("error");
		return mav;
	}
	
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setDate("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
  
