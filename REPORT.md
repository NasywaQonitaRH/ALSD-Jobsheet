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

**Brief explanaton:** There are 3 main step:
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
     \[
     IP = \frac{\text{total grade points}}{\text{total SKS}}
     \]
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
The solution is implemented in Selection.java, and below is screenshot of the result.


