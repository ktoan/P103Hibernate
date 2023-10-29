package com.example.hr.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public class AppFilter implements Filter {
  @Override
  public void doFilter(ServletRequest servletRequest,
                       ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;
    String requestURI = request.getRequestURI();
    if ("/login".equals(requestURI)) {
      filterChain.doFilter(servletRequest, servletResponse);
    } else {
      HttpSession session = request.getSession();
      Object userSession = session.getAttribute("username");
      if (userSession == null) {
        response.sendRedirect("/login");
      } else {
        filterChain.doFilter(servletRequest, servletResponse);
      }

    }
  }
}
