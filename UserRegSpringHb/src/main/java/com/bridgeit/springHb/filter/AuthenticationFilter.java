package com.bridgeit.springHb.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {


	public void init(FilterConfig fConfig) throws ServletException 
	{
		// TODO Auto-generated method stub
		System.out.println("Filter Initiated");
	}

   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		
		HttpSession session=req.getSession();
		Integer uid=(Integer) session.getAttribute("uid");
		//System.out.println("chcking");
		if(uid==null)
		{
			//System.out.println("logout");
			//resp.sendRedirect("/UserRegSpringHb/src/main/webapp/WEB-INF/views/login.jsp");
			System.out.println("redirected to login");
			resp.sendRedirect("login");
			
		} 
		else 
		{
			//System.out.println("checked");
			// pass the request along the filter chain
			chain.doFilter(req, resp);
		}
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
		
	}

	
}
