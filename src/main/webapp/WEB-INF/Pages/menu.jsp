<%-- 
    Document   : menu
    Created on : Oct 26, 2020, 12:50:46 PM
    Author     : Andreea
--%>

<nav class="navbar navbar-expand-md navbar-dark bg-dark ">
    <a class="navbar-brand" href="${pageContext.request.contextPath}">Online Tests</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
                
            <li class="nav-item ${activePage eq 'AddQuizController' ? ' active' : ''}">
                    <a class="nav-link " href="${pageContext.request.contextPath}/AddQuizController">Add Quiz </a>
                </li><!-- comment -->
          <li class="nav-item ${activePage eq 'ViewQuizList' ? ' active' : ''}">
                    <a class="nav-link " href="${pageContext.request.contextPath}/ViewQuizList">View Quizzes </a>
          </li>
                <li class="nav-item active">
                    <a class="nav-link " href="${pageContext.request.contextPath}/Users">Users </a>
                </li><!-- comment -->
    
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/Login">Login </a>           
           </li>
        </ul>
    </div>
</nav>
