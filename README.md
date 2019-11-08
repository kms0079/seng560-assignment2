# seng560-assignment2

(A)

To run this application:
-	Clone the repository from github to your local workstation.
-	Open the project in the Eclipse IDE
-	Select Run > Run As > Java Application
    - This will launch the application
-	Once the application has been launched, the user will be greeted with a welcome message. 
-	Next, he/she will be provided a main menu, which provides them the opportunity to select the operation they would like to perform (Add, Divide, Multiply, Subtract, or Quit) 
    -	If the user selects ‘Q’ 
         -	An exit message will be displayed, and the application will terminate
    -	If the user selects any of the other values A – Add, D – Divide, M – Multiply, or S – Subtract,
          -	They will be prompted to enter the first number. 
              -	If the input is empty or contains a letter, the user will be notified that the input is invalid, and the input value will be defaulted to 0.
          -	They will be prompted to ender the second number.
              -	If the input is empty or contains a letter, the user will be notified that the input is invalid, and the input value will be defaulted to 0.
          -	The result of the operation from the two values will be returned to the user.
          -	The user will be asked if he/she would like to convert the result to another unit.
              -	If the user selects ‘no’, 
                  -	They will be directed back to the main menu.
              -	If the user selects ‘yes’, 
                  -	They will be given the ability to choose from 2 – Binary, 8 – Octal, 16 – Hexadecimal
                  -	If they provide an invalid choice, 
                      - No conversion will be performed, and they will be directed back to the main menu.
                  -	If they provide a valid choice, 
                      - The value will be converted to the nearest whole number and the conversion will be based on that result.
                      -	The converted result will be displayed to the user.
                      - The user will be directed back to the main menu

(B)

I choose to use the following available library: https://github.com/gituser-z/SENG560. 
I found it to be very easy to integrate the library into my own application. 
All I had to do was open the project in Eclipse, export it as a JAR file, go to my project, select ‘Build Path > Add External Archives > Select the JAR that I just created, 
and then it was ready to be used within my application. Fortunately, I was able to reuse the code without making any changes to it. 
This was a very positive experience. 
Notably, the project was documented well and there was an adequate number of unit tests provided to represent the available functionality,
thus providing confidence in the merit of the library that I was choosing to use.
