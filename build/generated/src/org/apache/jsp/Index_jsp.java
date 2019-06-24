package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bank Details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <sql:setDataSource\n");
      out.write("\t\tvar=\"myDS\"\n");
      out.write("\t\tdriver=\"com.mysql.jdbc.Driver\"\n");
      out.write("\t\turl=\"jdbc:mysql://localhost:3306/bank\"\n");
      out.write("\t\tuser=\"root\" password=\"kundan\"\n");
      out.write("\t/>\n");
      out.write("      \n");
      out.write("    <div class=\"container\">\n");
      out.write("            <select name=\"stateslist\">\n");
      out.write("                <option value=\"\">Select State</option>\n");
      out.write("                <option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\n");
      out.write("                <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("                <option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("                <option value=\"Assam\">Assam</option>\n");
      out.write("                <option value=\"Bihar\">Bihar</option>\n");
      out.write("                <option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("                <option value=\"Chhattisgarh\">Chhattisgarh</option>\n");
      out.write("                <option value=\"Dadra and Nagar Haveli\">Dadra and Nagar Haveli</option>\n");
      out.write("                <option value=\"Daman and Diu\">Daman and Diu</option>\n");
      out.write("                <option value=\"Delhi\">Delhi</option>\n");
      out.write("                <option value=\"Goa\">Goa</option>\n");
      out.write("                <option value=\"Gujarat\">Gujarat</option>\n");
      out.write("                <option value=\"Haryana\">Haryana</option>\n");
      out.write("                <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\n");
      out.write("                <option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\n");
      out.write("                <option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("                <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("                <option value=\"Kerala\">Kerala</option>\n");
      out.write("                <option value=\"Lakshadweep\">Lakshadweep</option>\n");
      out.write("                <option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("                <option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("                <option value=\"Manipur\">Manipur</option>\n");
      out.write("                <option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("                <option value=\"Mizoram\">Mizoram</option>\n");
      out.write("                <option value=\"Nagaland\">Nagaland</option>\n");
      out.write("                <option value=\"Orissa\">Orissa</option>\n");
      out.write("                <option value=\"Pondicherry\">Pondicherry</option>\n");
      out.write("                <option value=\"Punjab\">Punjab</option>\n");
      out.write("                <option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("                <option value=\"Sikkim\">Sikkim</option>\n");
      out.write("                <option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("                <option value=\"Tripura\">Tripura</option>\n");
      out.write("                <option value=\"Uttaranchal\">Uttaranchal</option>\n");
      out.write("                <option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("                <option value=\"West Bengal\">West Bengal</option>\n");
      out.write("            </select>\n");
      out.write("          <sql:query var=\"listUsers\"dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myDS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\tSELECT * FROM bankdetails;\n");
      out.write("\t</sql:query>\n");
      out.write("            <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for names..\" title=\"Type in a name\" name=\"search\">\n");
      out.write("            <table id=\"myTable\" class=\"table table-bordered table-hover table-sm\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>IFSC</td>\n");
      out.write("                        <td>Bank_ID</td>\n");
      out.write("                        <td>Branch</td>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td>City</td>\n");
      out.write("                        <td>District</td>\n");
      out.write("                        <td>State</td>\n");
      out.write("                        <td>Bank_Name</td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <c:forEach var=\"user\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listUsers.rows}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.IFSC}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("\t\t\t\t\t<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.Bank_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("\t\t\t\t\t<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.Branch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("\t\t\t\t\t<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.Address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.City}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.District}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.State}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("                                        <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.Bank_Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</c:forEach>\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <ul class=\"pagination pagination-lg\">\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">Previous</a></li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("                <li class=\"page-item\"><a class=\"page-link\" href=\"#\">Next</a></li>\n");
      out.write("            </ul>\n");
      out.write("    <div>\n");
      out.write("        <script>\n");
      out.write("function myFunction() {\n");
      out.write("  var input, filter, table, tr, td, i, txtValue;\n");
      out.write("  input = document.getElementById(\"myInput\");\n");
      out.write("  filter = input.value.toLowerCase();\n");
      out.write("  table = document.getElementById(\"myTable\");\n");
      out.write("  tr = table.getElementsByTagName(\"tr\");\n");
      out.write("  for (i = 0; i < tr.length; i++) {\n");
      out.write("    td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("    if (td) {\n");
      out.write("      txtValue = td.textContent || td.innerText;\n");
      out.write("      if (txtValue.toLowerCase().indexOf(filter) > -1) {\n");
      out.write("        tr[i].style.display = \"\";\n");
      out.write("      } else {\n");
      out.write("        tr[i].style.display = \"none\";\n");
      out.write("      }\n");
      out.write("    }       \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
