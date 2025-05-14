|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020023|
| Nama |  Dewi Chalissa Rania |
| Kelas | TI - 1I |
| Repository | [link] ([https://github.com/ichaxpro/Algoritma-dan-Struktur-Data.git](https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #1 Programming Fundamentals Review

## 7.2 Sequential Search Method
### 7.2.2 Verification Experiment Result
The solution is implemented in sorting08.java, and sortingMain08.java. Below is screenshot of the result.

![image](https://github.com/user-attachments/assets/85ebd1b5-1236-4d7c-91e4-f78773e7eca2)

### 7.2.3 Verification Experiment Result
The solution is implemented in student08.java, studentSearch.java, and studentMain.java. Below is screenshot of the result.

![image](https://github.com/user-attachments/assets/ae96a473-acf5-41ca-9bc2-95d6885bafb0)
![image](https://github.com/user-attachments/assets/49ca8081-2abb-4682-8d0c-c6a79037f75e)

### 7.2.4 Question
*Brief explanaton:* 
1. The difference between the ShowData() and ShowPosition() functions is that ShowData() displays detailed information about a student based on the search result of their NIM, while ShowPosition() only shows the position (index) of the found data in the list or array.
2. The break statement in this code is used to stop the loop. Once the NIM we input is found, the loop will terminate immediately, allowing the program to proceed with executing the following code after the loop.
3. No, because this code uses a sequential search method. In this searching technique, the data does not need to be in a specific order. Therefore, the result will still be correct regardless of the data arrangement.
4. Because -1 represent the data is not found or  or that the search process has not yet started.

## 7.3 Binary Search Method
### 7.3.2 Result
![image](https://github.com/user-attachments/assets/2cb81b8c-6ad4-46d7-8d5b-88bc1b098db7)
### 7.3.3 Question
*Brief explanaton:* 
1.  ![image](https://github.com/user-attachments/assets/3dda78c4-0f06-4b47-ae17-6eb88f229034)

2. ![image](https://github.com/user-attachments/assets/634b37a2-3b37-49fb-b462-b95961054ecb)

Inside this loop, the code compares data[j] with the current minimum data[minIndex] an dif the data[j] is smaller it will ypdates minIndex to j
3. This condition is to check that j is start at 0 so that it stays inside the array and also checks if data[j] is bigger than key or as we know data[i].
4. It shifts the value of data[j] to the data[j+1]

## 7.4 Review Divide and Conquer
### 7.4.2 Verification Experiment Result
The solution is implemented in mergeSort.java, and sortMain08.java. Below is screenshot of the result.

![image](https://github.com/user-attachments/assets/2ebb306b-8abb-400a-9cc9-07108b4b6464)

## 7.5 Assignments
### Verification of Assignment Result
The solution is implemented in lecturer08.java, LecturerData08.java and LecturerDemo.java. Below is screenshot of the result.

![image](https://github.com/user-attachments/assets/9fa59520-0136-42c9-93b2-1e0ba9314363)

This code defines **three classes**:  

1. **`lecturerDemo`** (main class)  
   - Acts as the main method.
   - Creates an instance of LecturerData to store lecturer objects.
   - Adds lecturer data using the add() method.
   - Calls the print() method to display all lecturer information
   - Handling input to search the lecturer by their age

2. **`lecturerData08`** (method)  
   - contains method that will be executed in main method
   - Methods include:
      - add(Lecturer dsn): add lecturer to lecturerData Array
      - print(): Display all data
      - sortingASC(): Sort lecturers by age from youngest to oldest using Bubble Sort.
      - sortingDSC(): Sort lecturers by age from oldest to youngest using Selection Sort
      - findSeqSearch(): Searches through the lecturerData array sequentially (one by one) for lecturers whose age matches the search value
      - findBinarySearch(): Searches the lecturerFata Array using Binary algoirthm, binary search works by repeatedly dividing the search interval in half.
      - ShowPosition(): Handles the display of search results, showing how many lecturers match a certain
      - showData(): Displays the details of a lecturer (like ID, name, age, and gender) based on   the position/index.
      
3. **`lecturer08`** (attribute)
   - Represents a lecturer with attributes:
      - id (String) → Unique lecturer identifier.
      - name (String) → Lecturer’s name.
      - gender (boolean) → true for male, false for female.
      - age (int) → Lecturer’s age.
   - Contains a constructor to initialize lecturer objects.

