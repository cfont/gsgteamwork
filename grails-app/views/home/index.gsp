<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="layout" content="main" />
    <title>Home</title>
  </head>
  <body>
    <div class="newactions">
      <span class="newmessage">
        <g:link controller="message" action="create">Post Message</g:link>
      </span>
    </div>
    <h2>Messages</h2>
    <g:if test="${flash.toUser}">
      <div id="userMesage" class="info">
        ${flash.toUser}
      </div>
    </g:if>
    <g:each in="${messages}" var="message">
      <div class="amessage">
        <div class="messagetitle">
          ${message.title}
        </div>
        <div class="messagebody">
          ${message.detail}
        </div>
      </div>
    </g:each>


  </body>
</html>

