<%-- 
    Document   : editCity
    Created on : Feb 15, 2020, 10:19:56 PM
    Author     : mostafa
--%>

<%@page import="java.util.List"%>
<%@page import="net.seniorsteps.senior.common.bean.CityBean"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>




<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="updateCity?id=${citybeanid}" method="post">
        <table border="2">

            <tr>
                <th>name(Ar) </th>
                <td>
                    <input type="text" name="nameAr" value="${findCityById.nameAr()}"/>
                </td>


            </tr>

            <tr>
                <th>name(En) </th>
                <td>
                    <input type="text" name="nameEn" value="${findCityById.nameEn()}"/>
                </td>
                
            </tr>



            <tr>
                <th  colspan="2"> 

                    <input type="submit" name="button"  value="edit city"/>

                </th>

            </tr>
    </table>
            </form>
    </body>
</html>
