|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #3 ARRAY OF OBJECTS

## 1.2 Experiment 1: Create, insert, and display Array of Object
The solution is implemented in Rectangle.java, ArrayOfObjects.java and the code can't run cause the main method not found in the file .

![image](https://github.com/user-attachments/assets/35fc0fa6-3b8b-4312-9e8c-6f2aa4ae4b01)

![Screenshot 2025-03-04 130129](https://github.com/user-attachments/assets/d19e5c0b-0548-4a6f-94ca-460cc1e82973)


**Question Answer's:**  
1. Not necessarily, but it is recommended to have attributes and methods.
- Attributes are needed to store data for each object.
- Methods are used to perform operations on the object.
- If a class is just an empty object, it won't be useful in the program.

Example:

![image](https://github.com/user-attachments/assets/53a7ddf2-6e38-487a-8418-4a9c69647ac6)

In this example, the Rectangle class has attributes length and width, and a method calculateArea() to calculate the area.

2. If the Rectangle class does not have an explicitly defined constructor, Java automatically provides a default constructor with no parameters.
However, if we want to set attributes when the object is created, we can define a constructor like this:

![image](https://github.com/user-attachments/assets/362845cd-a4c6-438c-8b1f-75579dc9ad5d)

If there is no constructor, we have to use new Rectangle(); and manually set the attributes.

3. This code creates an array that can hold 3 objects of the Rectangle class, but does not create the objects yet.
After this line runs:
- rectangleArray is an array with 3 elements, but all of them are null.
- We need to instantiate each element of the array before using them.
Full example:

![image](https://github.com/user-attachments/assets/ef19048a-da9b-4699-9d2a-d3d5f8c059c7)

4. - rectangleArray[1] = new Rectangle(); → Creates a new object at index 1 of the array.
   - rectangleArray[1].length = 80; → Sets the length attribute to 80.
   - rectangleArray[1].width = 40; → Sets the width attribute to 40.
Now, rectangleArray[1] is a Rectangle object with dimensions 80x40.
5. Rectangle is a model class → It only stores attributes and methods for a single object.
ArrayOfObjects is the main class → It is responsible for managing multiple Rectangle objects.
Reasons for separation:
  - Encapsulation → Rectangle focuses only on itself.
  - Reusability → Rectangle can be used in other programs without modifying ArrayOfObjects.
  - Separation of Concerns → Rectangle handles object data, ArrayOfObjects manages the array.

## 1.3 Experiment 2: Input data into Array of Objects using Loops
The solution is implemented in Rectangle2.java, ArrayOfObjectsUp.java and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/5bd47682-3470-4cbe-acd5-cbd1a1401a01)

![Screenshot 2025-03-04 130338](https://github.com/user-attachments/assets/a6b26e10-10c8-41c3-8146-8edd2f9375eb)


**Question Answer's:**  
1. Yes, a 2D array of objects can be implemented. Instead of a single array of objects (Square[]), we can use a 2D array (Square[][]).
2. Since the answer is yes, here is an example

![image](https://github.com/user-attachments/assets/d9e52d46-dfe6-4d27-8307-3d69b0b2027d)

This creates a 2D array of Square objects and calculates their areas.
3. The error happens because squareArray[5] is null
new Square[100] only creates an array that can hold 100 objects but does not initialize them.
Before accessing side, we must first instantiate the object:

This is how to fix it:

squareArray[5] = new Square(); // initialize object

squareArray[5].side = 20; // now it's safe to assign a value

4. Now the array length is dynamically defined by user input. The modify code is in the SquareArray.java file, and this is the output

   ![image](https://github.com/user-attachments/assets/520ace53-2553-4410-a2da-a394a17795f1)

5. Yes, we can assign the same object to multiple positions in an array, but this will create a reference to the same object, not a copy.
   The effect of Changing ppArray[1] also changes ppArray[0] because both point to the same object in memory.
   To avoid that, create a new object instead of copying references 

## 1.4 Experiment 3: Mathematical operation in array of object’s attribute
The solution is implemented in Student.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/52cd1030-f8a2-4fb3-93c5-155c855c5dc3)

![Screenshot 2025-03-04 130534](https://github.com/user-attachments/assets/05ff8a77-3c8e-499a-8e2a-d184c1d0cdbc)

**Question Answer's:**  
1. Yes, a class can have multiple constructors. This is called constructor overloading, where multiple constructors have different parameter lists.
 - It allows different ways to create objects.
 - We can set default values when no arguments are provided.
 - We can initialize objects with specific values when arguments are given.  
2. The code is in the Triangle.java file. The Triangle class should have two attributes, base and height, and two constructors
3. - countArea() calculates the triangle area:
                     Area = 1/2×base×height
   - countPerimeter() calculates the perimeter of an isosceles triangle.
4. In the main function, we create an array of Triangle objects and initialize them. The code is in the TriangleArray.java file. 
5. This is the output

![image](https://github.com/user-attachments/assets/cd803ce4-a8b7-4a0f-8e13-95d12e6982a9)

## 1.5 Assignments
The solution is implemented in Lecturer22.java, LecturerDemo22.java and LecturerData22.java, below is screenshot of the result.

![image](https://github.com/user-attachments/assets/55d6997d-b408-47dd-8561-a66e6a1d7b83)
