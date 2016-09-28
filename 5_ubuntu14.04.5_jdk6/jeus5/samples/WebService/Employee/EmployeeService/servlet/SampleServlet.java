/*
 * Created on 2004. 8. 30.
 *
 * Copyright  2004 The Tmax Soft Quality Assurance Team
 */
package com.tmax.webservices.emp.servlet;

import com.tmax.webservices.emp.domain.Employee;
import com.tmax.webservices.emp.service.EmployeeService;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author kilsoo kang
 */
public class SampleServlet extends HttpServlet
{
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
      PrintWriter out = null;
      out = getWriter(response);

      // get Service object
      EmployeeService service = new EmployeeService();
      List employees = service.findEmployees();

      // display employees
      printEmployees(out, employees);

      // 
      out.flush();
      out.close();
   }

   /**
    *
    * @param out
    * @param employees
    */
   private void printEmployees(PrintWriter out, List employees)
   {
      out.println("<html><body>");
      out.println("<table border=\"1\">");

      Employee emp = null;

      for (int i = 0; i < employees.size(); i++)
      {
         out.println("<tr>");
         emp = (Employee)employees.get(i);
         out.println("<td>" + emp.getEmpNo() + "</td>");
         out.println("<td>" + emp.getName() + "</td>");
         out.println("<td>" + emp.getJob() + "</td>");
         out.println("<td>" + emp.getDeptNo() + "</td>");
         out.println("</tr>");
      }

      out.println("</table>");
      out.println("</body></html>");
   }

   /**
    *
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
      doGet(request, response);
   }

   /**
    * response 객체로부터 printWriter 객체를 구하는 메소드
    *
    * @return  PrintWriter
    */
   protected PrintWriter getWriter(HttpServletResponse res) throws IOException
   {
      PrintWriter out = null;

      try
      {
         out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(res.getOutputStream(), "euc-kr"), 2048), true);
      }
      catch (UnsupportedEncodingException use)
      {
         out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(res.getOutputStream()), 2048), true);
      }

      return out;
   }
}
