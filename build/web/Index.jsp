<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bank Details</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <sql:setDataSource
		var="myDS"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/bank"
		user="root" password="kundan"
	/>
        <sql:query var="listUsers" dataSource="${myDS}" >
		SELECT * FROM bankdetails;
	</sql:query>
        
    <div class="container">
            <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name" name="search">
            <div class="scrollmenu">
                <table id="myTable" class="table table-bordered table-hover table-sm">
                    <thead>
                        <tr>
                            <td>IFSC</td>
                            <td>Bank_ID</td>
                            <td>Branch</td>
                            <td>Address</td>
                            <td>City</td>
                            <td>District</td>
                            <td>State</td>
                            <td>Bank_Name</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="user" items="${listUsers.rows}">
                                    <tr>
                                            <td><c:out value="${user.IFSC}" /></td>
                                            <td><c:out value="${user.Bank_ID}" /></td>
                                            <td><c:out value="${user.Branch}" /></td>
                                            <td><c:out value="${user.Address}" /></td>
                                            <td><c:out value="${user.City}" /></td>
                                            <td><c:out value="${user.District}" /></td>
                                            <td><c:out value="${user.State}" /></td>
                                            <td><c:out value="${user.Bank_Name}" /></td>
                                    </tr>
                            </c:forEach>

                    </tbody>
                </table>
            </div>
            <ul class="pagination pagination-lg">
                <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
    <div>
        <script>
function myFunction() {
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toLowerCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toLowerCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
    </body>
</html>
