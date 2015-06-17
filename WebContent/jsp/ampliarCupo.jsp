<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--header.jsp -->

    <%@include file="../template/header.jsp"%>
    
       <h1>Banco XX</h1>
       <h2>Ampliar Disponible Tarjeta</h2>
           <h4></h4>
        <section id="formulario">
                <form name="buscarPorNumero" action="${pageContext.request.contextPath}/Banco/buscarPorNumero" method="post" enctype="text/html>">
                    <h2></h2>
                    <div class="texto">
                        <label for="numero" class="mano">Numero Tarjeta</label>
                    </div>
                    
                    <div class="elemento">
                        <input type="text" id="numero" name="numero" required autofocus/>
                     </div>
                    <br></br>                    
                    <input type="submit" id="enviar" class="mano" value="Enviar" /><!-- el type de enviar es submit->-->
                    <input type="reset" id="borrar"  class="mano" value="Borrar" /><!-- el type de borrar es rest-> -->
                </form>
            </section>
   </section>
<!--footer.jsp -->
    
    <%@include file="../template/footer.jsp"%>