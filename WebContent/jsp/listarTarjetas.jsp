<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--header.jsp -->

    <%@include file="../template/header.jsp"%>
    

 <section>
       <h1>Banco XX</h1>
       <h2>Listado General de Tarjetas</h2> 
    <!--tabla html dinámicamente-->
    <% ArrayList<Numero> numero=(ArrayList<Tarjetas>)request.getAttribute("numero"); %>
    <%--=clientes esto es para listar sin tabla--%>
   <table>
        <tr>
            <th>ID</th>
            <th>Número Tarjeta</th>
            <th>Saldo Máximo</th>
            <th>Saldo Disponible</th>
            <th>Tipo Tarjeta</th>
            <th>Número Comprobación</th>
            <th>Contraseña</th>
            <th>Estado Tarjeta</th>
        </tr>
        <% for(Cliente c: clientes ){ %>
            <form id="formulario<%= c.getId()%>" name="<%= c.getId()%>" action="#" 
                       method="post" enctype="text/html>" onsubmit="return false;">
              <tr id="<%= c.getId()%>">
                <td><input type="text" name="id" value="<%= c.getId() %>" /></td>
                <td><input type="text" name="numero" value="<%= c.getNumero() %>" /></td>
                <td><input type="text" name="cupoMaximo" value="<%= c.getCupoMaximo() %>" /></td>
                <td><input type="text" name="cupoDisponible" value="<%= c.getCupoDisponible() %>" /></td>
                <td><input type="text" name="tipo" value="<%= c.getTipo() %>" /></td>
                <td><input type="text" name="numeroComprobacion" value="<%= c.getNumeroComprobacion() %>" /></td>
                <td><input type="text" name="contrasenha" value="<%= c.getContrasenha() %>" /></td>
                <td><input type="text" name="bloqueada" value="<%= c.getBloqueada() %>" /></td>
                
                <td><input class="btnSinBordes" type="submit" 
                    value="Actualizar" name="btn<%= c.getId()%>" onclick="enviar(this);"/></td>
                <td><input class="btnSinBordes" type="submit" 
                    value="Eliminar" name="btn<%= c.getId()%>" onclick="enviar(this);"/></td>
               </tr>
             </form>
            
        <% } %>
        <!-- las siguientes tr se crearán dinámicamente usando 
            instrucciones java embebidas-->

    </table>   
 </section>
<!--footer.jsp -->
    
    <%@include file="../template/footer.jsp"%>