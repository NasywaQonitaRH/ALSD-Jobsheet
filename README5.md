|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #5 BRUTE FORCE AND DIVIDE CONQUER

## 5.2 Calculating Factorial Using Brute Force and Divide and Conquer Algorithms
The solution is implemented in BruteForceDivideConquer.java and the code can't run cause the main method not found in the file .

![Screenshot 2025-03-12 125548](https://github.com/user-attachments/assets/a08525b7-3945-4668-8d9e-a94ca65668e5)

![image](https://github.com/user-attachments/assets/abf40f2f-4db7-4757-8e81-fdc416c2b091)

**Question Answer's:**  
1. Differences in the if and else conditions in factorialDC(int n)
   - The if condition (if (n == 1) return 1;) serves as the base case in the recursive Divide & Conquer method. It stops the recursion when n reaches 1, ensuring that the function does not call itself indefinitely.  
   - The else condition (return n * factorialDC(n - 1);) represents the recursive step, which breaks the problem into smaller subproblems by multiplying n with the factorial of n-1 . This continues until the base case is met.
2. Alternative to the for loop in factorialBF(int n)
   Yes, the for loop in factorialBF() can be replaced with other looping constructs like a while loop or recursion.
```
  public int factorialBF(int n) {
    int facto = 1;
    int i = 1;
    while (i <= n) {
        facto *= i;
        i++;
    }
    return facto;
}
```
   
3. Differences between facto = facto * i; and int facto = n * factorialDC(n - 1);
   - facto = facto * i; is used in an iterative loop (Brute Force method), where facto is updated step by step as the loop progresses from 1 to n.  
   - int facto = n * factorialDC(n - 1); is used in a recursive function (Divide & Conquer method), where the function calls itself with a smaller value (n-1) until it reaches the base case.

4. Conclusion on the differences between factorialBF() and factorialDC()
   - factorialBF(int n):  
     - Uses an iterative approach with a loop.  
     - More efficient in terms of memory usage because it does not require additional function calls.  
     - Simple and straightforward to understand.  

   - factorialDC(int n):  
     - Uses a recursive approach (Divide & Conquer).  
     - Requires more memory due to recursive function calls (stack memory).  
     - More elegant in terms of mathematical representation but can lead to stack overflow for very large values of `n.  

## 5.3 Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms
The solution is implemented in PowerMain.java and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/bba2a6c8-1365-4d16-b3d6-6f0b0ac0f360)

![Screenshot 2025-03-12 130141](https://github.com/user-attachments/assets/90d785aa-2ddb-4694-87b3-3f3786c8cd0e)

**Question Answer's:**  
1. Differences between powerBF() and powerDC()
   - powerBF(): Uses an iterative approach (for loop) to calculate exponentiation. It multiplies the base number repeatedly for the given exponent.
   - powerDC()`: Uses recursion with a divide-and-conquer strategy. It splits the exponentiation problem into smaller subproblems, reducing the number of multiplications.

2. Does the `combine` stage exist in the provided code?
   - Yes, the combine stage exists in the powerDC() method. The relevant part is:
     ```
     if (e % 2 == 1) {
         return (powerDC(n, e / 2) * powerDC(n, e / 2) * n);
     } else {
         return (powerDC(n, e / 2) * powerDC(n, e / 2));
     }
     ```
   - This part of the code combines the smaller results to get the final exponentiation value.

3. Relevance of Parameters in powerBF()
   - The powerBF() method accepts parameters (int n, int e), even though the Power class already has baseNumber and exponent.
   - The method can be implemented without parameters by using this.baseNumber and this.exponent directly.
   - If modified to use the object's attributes, powerBF() would be structured as:
     ```
     int powerBF() {
         int result = 1;
         for (int i = 0; i < exponent; i++) {
             result *= baseNumber;
         }
         return result;
     }
     ```
4. Summary of powerBF() and powerDC()
   - powerBF(): Uses an iterative approach, multiplying the base repeatedly.
   - powerDC(): Uses recursion and reduces the problem size in each step for faster calculations. 

## 5.4 Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms
The solution is implemented in SumMain.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/520639e5-ed43-46b5-a55d-e019088d5512)

![Screenshot 2025-03-12 130659](https://github.com/user-attachments/assets/7892640c-73eb-4b83-a56a-b579c5e06beb)

**Question Answer's:**  
1. The mid variable is used to divide the array into two halves, allowing the divide and conquer approach to recursively calculate the sum for each half separately before combining the results.

2. Explain the following statements in totalDC() method:
   ```
   double lsum = totalDC(arr, l, mid);
   double rsum = totalDC(arr, mid+1, r);
   ```
   - lsum = totalDC(arr, l, mid); → Recursively calculates the sum of the left half of the array.  
   - rsum = totalDC(arr, mid+1, r); → Recursively calculates the sum of the right half of the array.  
   - These statements help break the problem into smaller subproblems, making it easier to solve recursively.

3.  
   ```
   return lsum + rsum;
   ```
   - Since lsum holds the sum of the left half and rsum holds the sum of the right half, adding them together gives the total sum of the entire array.

4. The base case is when l == r, meaning there is only one element left in the subarray. At this point, the function simply returns the value of that element.

5. 
   - The totalDC() method follows a divide and conquer strategy:  
     1. The array is recursively split into two halves.  
     2. Each half is summed separately using recursion.  
     3. The sums of the two halves are combined to get the final result.  
   - This method is more efficient for parallel processing but may have overhead due to recursive calls.

## 5.5 Assignments
The solution is implemented in StudentGrades.java, below is screenshot of the result.

![image](https://github.com/user-attachments/assets/b1c8d69f-aa94-451f-984c-e444fbd1e66f)

This program implements:
- findMax() for finding the highest UTS score
- findMin() for finding the lowest UTS score
- calculateAverage() for computing the average UAS using Brute Force
