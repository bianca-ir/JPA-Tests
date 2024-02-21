<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:pageTemplate pageTitle="ViewQuizList">
    <style>
        .quiz-container {
            border: 1px solid #ccc;
            padding: 20px;
            margin-bottom: 20px;
            width: 300px;
            height: 120px;
            background-color: #FAEDF7;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2); /* Adjust the values here */
        }

        .quiz-container .quiz-info {
            text-align: center;
        }
        .quiz-container h2 {
            margin-top: 0;
        }
         .quiz-wrapper {
            display: flex;
            flex-flow: wrap;
            gap: 40px;
            padding-left: 200px;
            border-radius: 20px;
        }
        /* Add more styles as needed */
    </style>
    <h1>Quizzes</h1>
    <div class="quiz-wrapper">
    <c:forEach var="quiz" items="${quizzes}" varStatus="status">
        <div class="quiz-container">
            <div class="quiz-info">
                <h2>${quiz.quizName}</h2>
                <p>${quiz.numberOfQuestions} Questions</p>
            </div>
        </div>
    </c:forEach>
    </div>
</t:pageTemplate>
