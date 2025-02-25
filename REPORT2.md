|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #2 OBJECT

## 2.1 Experiment 1: Declaring Classes, Attributes, and Methods
The solution is implemented in Student22.java, and the code can't run cause the main method not found in the file .

![Screenshot 2025-02-19 153401](https://github.com/user-attachments/assets/5d01d0de-fc84-46e2-9570-7b79a0ea710c)

**Question Answer's:**  
1. **Two characteristics of a class or object:**  
   - **Encapsulation:** Hides implementation details and only exposes necessary parts through public methods.  
   - **Inheritance:** A class can inherit attributes and methods from another class.  
2. **Number of attributes in the `Student` class and their list:**  
   The class has **4 attributes**:  
   - studentID (String)  
   - name (String)  
   - className (String)  
   - gpa (double)  
3. **Number of methods in the Student class and their list:**  
   The class has 4 methods:  
   - print() 
   - changeClass(String newClass)
   - updateGPA(double newGPA)
   - evaluate()  
4. **Modify the updateGPA() method to only accept values between 0.0 and 4.0:**  
   void updateGPA(double newGPA) {
       if (newGPA >= 0.0 && newGPA <= 4.0) {
           gpa = newGPA;
       } else {
           System.out.println("Invalid GPA. Must be between 0.0 and 4.0.");
       }
   }
   
5. **Explanation of how the evaluate() method works:**  
   The evaluate() method assesses student performance based on GPA using the following criteria:  
   - **GPA ≥ 3.5** → Returns "Excellent"
   - **GPA ≥ 3.0** → Returns "Good" 
   - **GPA ≥ 2.0** → Returns "Fair"  
   - **GPA < 2.0** → Returns "Poor" 


## 2.2 Experiment 2: Object Instantiation and Accessing Attributes and Methods
The solution is implemented in StudentMain.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/d8b25a68-0b35-4931-867b-ea43f4e59b78)
![image](https://github.com/user-attachments/assets/079e2c68-9441-4f17-967b-1b5c837b0130)

**Question Answer's:** 
Here are the answers based on the given code:

1. **Line of Code for Instantiation & Object Name**  
   The line of code in StudentMain used for instantiation is:
   Student student1 = new Student();
   
   The name of the created object is **student1**
2. **Accessing Attributes and Methods of an Object**  
   Attributes and methods of an object are accessed using the **dot (.) operator**.  
   - Example of accessing attributes:
     student1.name = "Tiara";
   - Example of calling methods:
     student1.print();
     student1.changeClass("TI-2I");
3. **Difference in Output of First and Second print() Calls**  
   The first print() call displays the initial values of the student1 object. After calling changeClass("TI-2I") and updateGPA(3.9), the class name and GPA are updated. The second print() call then reflects these changes, leading to a different output.

## 2.3 Experiment 3: Creating Constructor
The solution is implemented in Student.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/ded27cb0-1195-4d82-93bf-a97f097776c6)

**Question Answer's:** 
Here are the answers based on the provided information:

1. **Line of Code for the Parameterized Constructor in `Student` Class**  
   The parameterized constructor in Student is declared as:
   public Student(String id, String name, String cls, double gpa) {
       studentID = id;
       this.name = name;
       className = cls;
       this.gpa = gpa;
   }
2. **Explanation of the Line in StudentMain**
   Student student2 = new Student("244107020040", "Rizky", "TI-1I", 3.5);
   This line creates a new Student object named `student2` using the parameterized constructor. It assigns:
   - studentID = "244107020040"
   - name = "Rizky"
   - className = "TI-1I"
   - gpa = 3.5  
   The object student2 now holds these values.
3. **Removing the Default Constructor & Running the Program**
   - If the default constructor (public Student() { }) is removed, the program will compile and run successfully as long as all instances of Student use the parameterized constructor.
   - However, if any part of the code tries to create a `Student` object without arguments, like:
     Student student1 = new Student(); // This will cause an error!
     The compiler will throw an **error**, because **there is no constructor without parameters** in the Student class anymore.
4. **Do Methods in Student Need to Be Accessed in Order?**
   No, methods do not need to be accessed in a specific order.  
   - Methods can be called based on the required functionality.
   - For example, print(), updateGPA(), and changeClass() can be executed in any order, but their effect will depend on when they are called.
5. **Creating a New Object Named studentNasywa**
   Student studentNasywa = new Student("244107020099", "Nasywa", "TI-2B", 3.7); 
   This creates a Student object with:
   - studentID = "244107020099"
   - name = "Nasywa"
   - className = "TI-2B"
   - gpa = 3.7  
   You can also call methods on studentNasywa:
   
   studentNasywa.print();

   studentNasywa.updateGPA(3.8);

   studentNasywa.print();
  
## 2.4 Assignments
The solution is implemented in Course.java, CourseMain.java and Lecturer.java, LecturerMain.java, below is screenshot of the result.

![image](https://github.com/user-attachments/assets/1dcc4a09-0181-4002-a4d7-294da29d3ecd)

![image](https://github.com/user-attachments/assets/e83948f9-8f65-422e-aa4e-d9aaee686f94)


**Question Answer's:** 
1. 
2. 
3. 
