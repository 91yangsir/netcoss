package com.yangsir.project.filters;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class URLHandleFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		URLHandleServletRequest wrapper = new URLHandleServletRequest(req);
		chain.doFilter(wrapper, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}
	
	
	private static class URLHandleServletRequest extends HttpServletRequestWrapper {

		private HttpServletRequest request;

		public URLHandleServletRequest(HttpServletRequest request) {
			super(request);
			// TODO Auto-generated constructor stub
			this.request = request;
		}

		@Override
		public String getRequestURI() {
			// TODO Auto-generated method stub
			String requestUrI = "";
			try {
				requestUrI = URLDecoder.decode(request.getRequestURI(), "utf-8");
			} catch (Exception e) {
				// TODO: handle exception
			}
			return requestUrI;
		}

		@Override
		public String getServletPath() {
			// TODO Auto-generated method stub
			String servletPath = "";
			try {
				servletPath = request.getServletPath();
				servletPath = URLDecoder.decode(servletPath, "utf-8");
			} catch (Exception e) {
				// TODO: handle exception
			}
			return servletPath;
		}

		@Override
		public StringBuffer getRequestURL() {
			// TODO Auto-generated method stub
			String requestUrL = "";
			try {
				requestUrL = URLDecoder.decode(request.getRequestURL().toString(), "utf-8");
			} catch (Exception e) {
				// TODO: handle exception
			}
			return new StringBuffer(requestUrL);
		}
	}

}


