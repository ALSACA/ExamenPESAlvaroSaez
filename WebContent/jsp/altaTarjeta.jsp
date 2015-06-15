<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--header.jsp -->

    <%@include file="../template/header.jsp"%>
    

    <section>
       <h1>Banco XX</h1>
       <h2>Alta Tarjetas</h2>
            <h4></h4>
        <section id="formulario">
            <form name="altatarjeta" action="/ExamenPESAlvaroSaez/Banco/altaTarjetas" method="post" enctype="text/html>">
                    <h4>NUEVA TARJETA</h4>
                    <div class="elemento">
                        <input type="hidden" id="id" name="id" required autofocus />
                    </div>
                    <div class="texto">
                        <label for="numero" class="mano">Número Tarjeta</label>
                    </div>
                    <div class="elemento">
                        <input type="text" id="numero" name="numero" required autofocus/>
                     </div>
                     <br/><br/>
                    <div class="texto">
                        <label for="cupoMaximo" class="mano">Saldo Máximo</label>
                    </div>
                    <div class="elemento">
                        <input type="text" id="cupoMaximo" name="cupoMaximo" required autofocus />
                    </div>
                    <br/><br/>
                    <div class="texto">
                        <label for="cupoDisponible" class="cupoDisponible">Saldo Disponible</label>
                    </div>
                    <div class="elemento">
                        <input type="text" id="cupoDisponible" name="cupoDisponible" required autofocus />
                    </div>
                    <br/><br/>
                    <div class="texto">
                        <label for="tipo" class="tipo">Tipo Tarjeta</label>
                    </div>
                    <div class="elemento">
                        <label for="visa">VISA</label>
                        <input type="radio" name="tipo" value="visa" id="tipo"/> 
                        <label for="master">MASTERCARD</label>
                        <input type="radio" name="tipo" value="master" id="tipo"/>
                    </div>
                    <br/><br/>
                    <div class="texto">
                        <label for="numeroComprobacion" class="numeroComprobacion">Número Comprobación</label>
                    </div>
                    <div class="elemento">
                        <input type="text" id="numeroComprobacion" name="numeroComprobacion" required autofocus />
                    </div>
                    <br/><br/>
                    <div class="texto">
                        <label for="contrasenha" class="contrasenha">Contraseña</label>
                    </div>
                    <div class="elemento">
                        <input type="text" id="contrasenha" name="contrasenha" required autofocus />
                    </div>
                    <br/><br/>
                    <div class="texto">
                        <label for="bloqueada" class="bloqueada">Estado Tarjeta</label>
                    </div>
                    <div class="elemento">
                        <label for="bloqueada">Bloqueada</label>
                        <input type="radio" name="bloqueada" value="true" id="bloqueada"/> 
                        <label for="bloqueada">Activa</label>
                        <input type="radio" name="bloqueada" value="false" id="bloqueada"/>
                    </div>
                    <br/><br/>
                    <input type="submit" id="enviar" class="mano" value="Enviar" /><!-- el type de enviar es submit->-->
                    <input type="reset" id="borrar"  class="mano" value="Borrar" /><!-- el type de borrar es rest-> -->
                </form>
            </section>
    </section>     
       
<!--footer.jsp -->
    
    <%@include file="../template/footer.jsp"%>