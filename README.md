# AssignmentCalculatorAPI
 Rest API Based Calculator (Only Backend)
 
Request: GET http://localhost:8080/calculatorapi/v1/addition?number1=12&number2=15
Response: {
              "answer": 27.0,
              "detail": "12 + 15 = 27.0"
          }

Request: GET http://localhost:8080/calculatorapi/v1/subtraction?number1=12&number2=15
Response:{
             "answer": -3.0,
             "detail": "12 - 15 = -3.0"
         }

Request: GET http://localhost:8080/calculatorapi/v1/multiplication?number1=12&number2=15
Response:{
             "answer": 180.0,
             "detail": "12 * 15 = 180.0"
         }

Request: GET http://localhost:8080/calculatorapi/v1/division?number1=12&number2=15
Response:{
             "answer": 0.8,
             "detail": "12 / 15 = 0.8"
         }

Request: GET http://localhost:8080/calculatorapi/v1/square/5
Response:{
             "answer": 25.0,
             "detail": "Square of 5 = 25.0"
         }

Request: GET http://localhost:8080/calculatorapi/v1/squareroot/225
Response:{
             "answer": 15.0,
             "detail": "Squareroot of 225 = 15.0"
         }

Request: GET http://localhost:8080/calculatorapi/v1/factorial/5
Response:{
             "answer": 120.0,
             "detail": "5! = 120.0"
         }


Request: POST http://localhost:8080/calculatorapi/v1/min-max
Body { "numbers" : [10,-5,7,15,-7,-6,16,19,-15,9] }
Response: min : -15, max : 19
