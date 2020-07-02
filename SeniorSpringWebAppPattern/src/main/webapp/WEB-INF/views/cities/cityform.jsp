<%-- 
    Document   : cityform
    Created on : Apr 20, 2020, 3:13:49 PM
    Author     : mostafa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="addcity"  method="post"  >
        <table border="2">

            <tr>
                <th>nameAr </th>
                <td>
                    <input type="text" name="nameAr"/>
                </td>


            </tr>

            <tr>
                <th>nameEn </th>
                <td>
                    <input type="text" name="nameEn"/>
                </td>
                
            </tr>



            <tr>
                <th  colspan="2"> 

                    <input type="submit" name="button"  value="add city"/>

                </th>

            </tr>
    </table>

     </form>
    </body>
</html>
