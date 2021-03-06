/*
 *  
 *  Copyright 2012 extreme.org  
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 */

package org.extreme.pppoverlay;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PortalOverlayServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                HttpServletResponse response)
                throws ServletException, IOException
    { 
       PrintWriter out = response.getWriter();

       out.println("<html>");
       out.println("<head>");
       out.println("</head>");
       out.println("<body bgcolor=\"#fff\">");
       out.println("<br>");
       out.println("<h1>Vdi Portal Overlay</h1>");
       out.println("<p>You may now put what you want on this page.</p>");
       out.println("</body>");
       out.println("</html>");
    }
}
