|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #6 - SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 6.2 Experiment 1 - Implementing Sorting Using Objects
The solution is implemented in Sorting.java and the code can't run cause the main method not found in the file .

a. 
![image](https://github.com/user-attachments/assets/9dbc3453-1b4c-4c43-9f4e-2011ddd4019b)

b.
![Screenshot 2025-04-01 213251](https://github.com/user-attachments/assets/90b27974-9933-43ac-a1b2-b094033e5a01)

c.
![image](https://github.com/user-attachments/assets/8439261c-1adc-43a0-8e6b-ba8dd5b873c0)

**Question Answer's:**  
1. Explain the function of the given program code:
```
if (data[j] > data[j + 1]) {
    int temp = data[j];
    data[j] = data[j + 1];
    data[j + 1] = temp;
}
```
This code is a swap operation used in the Bubble Sort algorithm.  
- It checks if the current element (`data[j]`) is greater than the next element (`data[j + 1]`).  
- If true, it swaps the two elements to ensure the larger element moves towards the end of the array.  
- This process is repeated to sort the array in ascending order by pushing larger values to the right.


2. Show the program code that implements the minimum value search algorithm in Selection Sort
The minimum value search algorithm in Selection Sort finds the smallest element in the unsorted portion of the array and swaps it with the current position.

Code:
```
for (int i = 0; i < size - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < size; j++) {
        if (data[j] < data[minIndex]) {
            minIndex = j;
        }
    }
    // Swap the found minimum element with the first element of the unsorted part
    int temp = data[minIndex];
    data[minIndex] = data[i];
    data[i] = temp;
}
```
This ensures that the smallest element is placed at the beginning of the array in each iteration.


3. In insertion sort, explain the purpose of the condition in the loop
```java
while (j >= 0 && data[j] > key)
```

- This condition ensures that **larger elements are shifted to the right** to make space for the new element (`key`).  
- The loop runs as long as `j` is **within array bounds (`j >= 0`)** and **`data[j]` is greater than `key`**.
- This is the key operation in **Insertion Sort**, as it **compares the key with previous elements and shifts them** to insert the key at the correct position.

4. In insertion sort, what is the purpose of the given command?
```
data[j + 1] = data[j];
```
- This shifts elements to the right in the array to create space for inserting the key.
- It moves each larger element (data[j]) one position to the right (data[j + 1]) until the correct position for the key is found.
- This ensures that when the key is inserted, the array remains sorted.


## 6.3 Experiment 2- Sorting Using an Array of Objects
The solution is implemented in Students.java, TopStudents.java, StudentDemo.java and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/ba53be86-394b-4923-b873-15fb4c463603)


**Question Answer's:**  
1. From the following code snippet, answer questions a–c:

```
for (int i = 0; i < idx - 1; i++) {
for (int j = 0; j < idx - i - 1; j++) {
```

a. Why does the condition in the `bubbleSort()` loop use `i < idx - 1`?
Bubble Sort iterates `n-1` times (where `n` is the number of elements). This is because in each iteration, the remaining largest element is moved to its correct position. After `n-1` iterations, the entire array is already sorted correctly, so no additional iterations are needed.

b. Why does the condition in the `bubbleSort()` loop use `j < idx - i - 1`?
After each outer iteration (`i`), the largest element is already in its correct final position. Therefore, the unsorted portion becomes smaller with each iteration. The condition `j < idx - i - 1` ensures that we do not compare the sorted elements at the end of the array.

c. If the number of entries in listStudents is 50, how many times will loop `i` run? How many stages of Bubble Sort will it perform?
- Loop `i` will run 49 times (`50 - 1 = 49`), since Bubble Sort requires `n-1` iterations to complete the sorting.
- Each iteration `i` is called one stage of Bubble Sort, so there are 49 stages.

2. Modification at StudentDemo.java to receive input from keyboard:

```
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TopStudents topStudents = new TopStudents();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            System.out.print("Kelas: ");
            String studentClass = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); 

            Student student = new Student(nim, name, studentClass, gpa);
            topStudents.add(student);
        }

        System.out.println("\nDaftar Mahasiswa Sebelum Sorting:");
        topStudents.print();

        // Sorting Bubble Sort
        topStudents.bubbleSort();

        System.out.println("\nDaftar Mahasiswa Setelah Sorting (GPA Descending):");
        topStudents.print();

        scanner.close();
    }
}
```

![image](https://github.com/user-attachments/assets/89100dea-f31d-4635-affb-befa3df16553)


## 6.3.5 Sorting Student Data Based on GPA (Selection Sort)
The solution is implemented in SumMain.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/520639e5-ed43-46b5-a55d-e019088d5512)


**Question Answer's:**  
1. 




## 5.5 Assignments
The solution is implemented in StudentGrades.java, below is screenshot of the result.
