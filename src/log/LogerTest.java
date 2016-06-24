package log;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LogerTest {
	//日志
	private static final Logger logger=Logger.getLogger(LogerTest.class);
	//单元测试
	public boolean isEmpty(String abc){
		return abc.equals("");
	}

	public boolean transfer(String accountFrom,String accountTo,BigDecimal amount){	
		logger.debug("From:"+accountFrom);
		logger.debug("To:"+accountTo);
		logger.debug("Amount:"+amount);		
		return true;
	}

	public static void main(String[] args) {
		//------------------------日志-------------------// 
		//		LogerTest l=new LogerTest();
		//		l.transfer("6222", "6740", new BigDecimal(1000));
	}

}
