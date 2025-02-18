|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution
The solution is implemented in Selection.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/c9aec40c-96ba-4bb2-b21f-326b675bd5f0)
![Image](https://github.com/user-attachments/assets/7ea341b3-bde7-43b6-ad74-76a370c6a149)
![Image](https://github.com/user-attachments/assets/e514c01d-842e-4639-a546-fb7618c3b4ea)

**Brief explanaton:** There are 5 main step: 
1. User Input for Scores
   - The program prompts the user to enter scores for assignments, quizzes, mid-term exams, and final exams.  
   - The `inputScore` method ensures the entered scores are between 0 and 100. If an invalid score is entered, it returns `-1`.  
2. Final Score Calculation  
   - If any input is invalid, the program prints an error message and stops.  
   - Otherwise, the final score is calculated using weighted averages:  
     - 20% from assignments  
     - 20% from quizzes  
     - 30% from mid-term exams  
     - 30% from final exams  
3. Letter Grade Assignment  
   - The `getLetterGrade` method determines the letter grade based on the final score using predefined score ranges.  
4. Pass/Fail Decision  
   - The program prints the final score and letter grade.  
   - If the grade is A, B+, B, C+, or C, the user passes. Otherwise, they fail.  
5. Program Termination  
   - The scanner is closed, and the program ends.

## 2.2.1. Looping Solution
The solution is implemented in Looping.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/243a085c-15a4-4e4a-b7e3-4c1e26177a9e)
![Image](https://github.com/user-attachments/assets/99b18381-e0ab-494b-8d36-3739f480514e)

**Brief explanaton:** There are 3 main step:
1. User Input for NIM
   - The user is prompted to enter their NIM.  
   - The last two digits of the NIM are extracted and converted into an integer (`n`).  
   - If `n` is less than 10, `10` is added to ensure a minimum value of 10.  
2. Loop to Print Pattern
   - A loop runs from `1` to `n`.  
   - The numbers 6 and 10 are skipped using `continue`.  
   - If the number is even, it is printed.  
   - If the number is odd, an asterisk (`*`) is printed instead.  
3. Program Termination
   - The scanner is closed, and the program ends.

## 2.3.1. Array Solution
The solution is implemented in Selection.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/86feeb25-076d-4465-951f-eef4e29d6bdc)

**Brief explanaton:** There are 4 main step:
1. User Input  
   - The user enters the number of courses.  
   - For each course, the user inputs:  
     - Course name  
     - SKS (credit hours)  
     - Numerical grade  
2. Grade Conversion
   - The `convertToLetterGrade` method converts numerical grades to letter grades (A, B+, B, etc.).  
   - The `convertToGradePoints` method assigns grade points based on the letter grade.  
3. Display Grade Table  
   - A formatted table prints course names, numerical grades, letter grades, and grade points.  
4. GPA Calculation
   - The total weighted grade points (`bobot nilai * SKS`) and total SKS are summed.  
   - The Semester GPA (IP) is calculated as:  
                 IP = total grade points/total SKS
   - The final GPA is displayed.
  
## 2.4.1. Function Solution
The solution is implemented in Function.java and Function2.java, below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/e6682906-9609-4bf0-8bb4-465d5dbf756d) Function2.java

![Image](https://github.com/user-attachments/assets/89a1a9f4-8c6b-4f83-940f-4d1e2f1584d5) Function.java

**Brief Explanation:** There are 5 Main Steps:
1. Initialize Variables and Scanner
   - A `Scanner` object is created to take user input.  
   - Arrays for flower names, prices, and a 2D array (4x4) for flower stock are initialized.
2. User Input for Flower Stock  
   - The program prompts the user to enter flower stock for each of the 4 branches.  
   - The input is stored in the `flowerStock` 2D array.
3. Calculate and Display Income for Each Branch (`displayIncome` method)  
   - Loops through each branch and calculates total income based on the stock and price of each flower.  
   - Prints the total revenue if all flowers are sold.
4. Reduce Stock Due to Flower Deaths  
   - An array `stockReduction` holds values of stock reduction for RoyalGarden 4.  
   - The `displayStockAfterDeath` method updates the stock for RoyalGarden 4 and displays the final values.
5. Closing the Scanner  
   - The `scanner.close();` statement ensures that system resources are freed after input is taken.

Main Functionality
- The program takes input, calculates income, and updates stock after accounting for dead flowers.

## 2.5.1. Assignment Solution
The solution is implemented in Carplate.java, Cubecalculate.java, Schedule.java and below is screenshot of the result.

**Carplate.java**

![Image](https://github.com/user-attachments/assets/38b02fc0-c8c9-4cdb-8fa3-91d5f8e745de)
![Image](https://github.com/user-attachments/assets/21efcece-21a9-4d1b-a2ac-af87c25133b8)
![Image](https://github.com/user-attachments/assets/ea327323-d132-463b-b95e-2a684bf52904)

**Brief Explanation:** There are 4 Main Steps:
1. Define Car Plate Codes and Cities
   - Two arrays:  
     - `CODE`: Contains valid plate letters (`A, B, D, etc.`).  
     - `CITY`: Contains corresponding city names (`BANTEN, JAKARTA, BANDUNG, etc.`).  
2. User Input
   - The user enters a single letter representing a car plate code.  
   - The input is converted to uppercase to ensure case insensitivity.  
3. City Lookup
   - The program searches for the input letter in the `CODE` array.  
   - If found, the corresponding city name from the `CITY` array is displayed.  
   - If not found, it prints `"Invalid car plate code!"`.  
4. Program Termination
   - The scanner is closed, and the program ends.  

**Cubecalculate.java**

![Image](https://github.com/user-attachments/assets/f6cdc112-b734-4bd2-9355-6034bfde1284)
![Image](https://github.com/user-attachments/assets/fe757093-e761-4f78-a0ad-ce5234c5fa25)
![Image](https://github.com/user-attachments/assets/38b57f32-7c9d-48d0-94e2-e8d4d06fe58a)

**Brief Explanation:** There are 4 Main Steps:
1. Define Calculation Methods  
   - `volume(double side)`: Computes the cube’s volume \(\text{side}^3\).  
   - `surfaceArea(double side)`: Computes the surface area \(6 \times \text{side}^2\).  
   - `perimeter(double side)`: Computes the total edge length \(12 \times \text{side}\).  
2. User Input
   - The user enters the side length of the cube.  
   - The user selects a calculation type (1 = Volume, 2 = Surface Area, 3 = Perimeter).  
3. Calculation and Output  
   - The program uses a switch statement to call the corresponding method based on the user's choice.  
   - The result is printed. If the input is invalid, it displays `"Invalid choice!"`.  
4. Program Termination
   - The scanner is closed, and the program ends. 

**Schedule.java**

![Image](https://github.com/user-attachments/assets/b652031a-714c-409a-a1f4-0727ba9170db)

![Image](https://github.com/user-attachments/assets/f1ee090b-6a36-49ed-ae61-15f727e7dfe2)

**Brief Explanation:** There are 4 Main Steps:
1. User Input for Course Details 
   - The user enters the number of courses.  
   - For each course, the user provides:  
     - Course name  
     - Credit hours (SKS)  
     - Semester  
     - Lecture day  
2. Menu-Driven System (Looped Until Exit)  
   - The user selects an option from the menu:  
     1. Display All Courses → Lists all entered courses.  
     2. Display Courses by Day → Shows courses scheduled on a specific day.  
     3. Display Courses by Semester → Shows courses taken in a specific semester.  
     4. Search Course by Name → Finds a course based on user input.  
     5. Exit → Ends the program.  
3. Course Searching and Filtering
   - The program uses loops and conditions to match user input with stored course data.  
   - Case-insensitive comparisons ensure flexibility in searches.
4. Program Termination
   - The program keeps running until the user chooses option `5 (Exit)`.  
   - The scanner is closed before exiting.  
