package com.alibaba.ppm.workflow;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BusinessProcess {
	public boolean doProcess(HttpServletRequest reques,HttpServletResponse response);
}
