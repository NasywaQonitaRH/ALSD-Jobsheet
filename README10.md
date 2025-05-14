|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #10 Stack

## 2.1 Experiment 1 - Assignment Submission
### 2.1.2 Verification Experiment Result
The solution is implemented in Student22.java, and StudentAssignmentStack22.java and StudentDemo22.java. Below is screenshot of the result.

![image](https://github.com/user-attachments/assets/6de66f5f-485b-4aed-85ed-556df4a84083)


### Answers to 2.1.3 Questions
1. Stack role in assignment management: A stack is used because it follows the Last-In-First-Out (LIFO) principle, which matches how assignments are physically stacked on a desk and graded (top one first). This is more appropriate than a queue or list because we want to process the most recent submission first.
2. push() vs pop() methods:
- push() adds a new assignment to the top of the stack
- pop() removes and returns the top assignment for grading
- In this program, students' assignments are pushed onto the stack when submitted, and popped when being graded.
3. Checking isFull() before push(): It's important to check if the stack is full before pushing to prevent array index out of bounds exceptions. Without this check, the program would try to add elements beyond the array's capacity, causing runtime errors.
4. Storage capacity: The stack can store 5 assignments, determined by the line StudentAssignmentStack stack = new StudentAssignmentStack(5); in the StudentDemo class.
5. Showing first student:
- Add this method to StudentAssignmentStack:
```
public Student22 getBottom() {
    if (!isEmpty()) {
        return stack[0];
    }
    return null;
}
```
- Add a new menu option in StudentDemo to display this information.
6. Count assignments method:
```
public int countAssignments() {
    return top + 1;
}
```
7. Real-world applications: Stack-based systems are useful in many scenarios like:
- Browser history (back button)
- Undo/redo functionality in software
- Call stack in program execution
- Parsing expressions and syntax checking
  
## 2.2.Experiment 2- Convert Assignment Grade to Binary
### 2.2.3 Verification Experiment Result
 Below is screenshot of the result.

![image](https://github.com/user-attachments/assets/23fd065a-0e9f-40d1-ba6b-c63c442382fa)

### Answers to 2.2.3 Questions
1. convertToBinary() workflow:
- Takes an integer grade as input
- Creates a ConversionStack to store binary digits
- Repeatedly divides the grade by 2 and pushes the remainder onto the stack
- Once the grade reaches 0, pops all digits from the stack to construct the binary string
- Returns the binary string representation
2. Changing loop condition to while (grade != 0):
- This would work correctly for positive grades
- The original condition (grade > 0) is slightly safer as it clearly indicates we only work with positive numbers
- For grade = 0, the original would return an empty string while the modified version would enter an infinite loop (since 0 != 0 is false immediately)
- The original condition is more explicit about handling only positive numbers

## 2.4 Assignment Excuse Letter Management
The solution is implemented in ExcuseLetter22.java, ExcuseLetterStack22.java, and ExcuseLetterDemo22.java. Here's the screenshot of the result.

![image](https://github.com/user-attachments/assets/bed4f32a-598b-41c0-ab8c-0363774136ae)
![image](https://github.com/user-attachments/assets/2c85b56d-ff3d-4c93-a405-7dc1a419f073)
![image](https://github.com/user-attachments/assets/87dfc7f8-10b8-4cb1-9673-b2717147377c)
![image](https://github.com/user-attachments/assets/b4c07b12-4aae-4d47-891d-d7f9ed4ae865)






