|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #12 Linked List Implementation

## 1 Experiment 1 - Implementing Single Linked List
### 2.1.1 Output Verification
The solution is implemented in Student22.java, Node22.java, SingleLinkedLIst22.java and SLLMain22.java. Below is screenshot of the result.


![Screenshot 2025-05-22 142304](https://github.com/user-attachments/assets/dd95ebd5-d6e6-4045-9091-5eac947000ee)


### Answers to 2.1.2 Questions
1. **Why does compiling the program code result in the message "Linked List is Empty" on the first line?**
Because when we first create the SingleLinkedList object and call the print() method, the list is empty (head is null), so the isEmpty() condition in the print() method is true, resulting in the "LinkedList is empty!!" message.
2. **Explain the general purpose of the variable temp in each method!**
The variable temp is used as a temporary reference to traverse through the linked list. It starts at the head node and moves through each subsequent node (temp = temp.next) until it reaches the desired position or the end of the list. This allows us to examine or modify nodes without losing our reference to the head of the list.
3. **Modify the code so that data can be added via keyboard input!**
I've added this functionality in the SLLMain22 class (in the last part of the code). It uses Scanner to get input from the user and creates a new Student22 object which is then added to the list.
4. **What would happen if we did not use the tail attribute? Would it affect the code implementation? Please explain.**
Without the tail attribute, we would need to traverse the entire list from the head to find the last node every time we want to add a new node at the end (addLast operation). This would make the addLast operation O(n) instead of O(1). The tail attribute provides direct access to the end of the list, making addLast operations more efficient.
  
## 2. Experiment 2- Accessing Element in Single Linked List
### 2.2.2 Verification Output
 Below is screenshot of the result.

![image](https://github.com/user-attachments/assets/037069ad-4e6e-4753-99c2-c2cff5e298c2)


### Answers to 2.2.3 Questions
1. **Why is the break keyword used in the remove function?**
The break keyword is used to exit the loop once the node with the matching key is found and removed. This prevents unnecessary iterations through the rest of the list after the operation is complete, improving efficiency.
2. **Explain the purpose of the code below in the remove method.**
```
temp.next = temp.next.next;
if (temp.next == null) {
    tail = temp;
}
```

This code removes a node by bypassing it in the linked list (setting the current node's next pointer to skip the next node). The if condition checks if the removed node was the last node (tail), and if so, updates the tail to be the current node (temp).

## 3. Assignment: Queue Implementation using Linked List
The solution is implemented in StudentQueue22.java and QueueuMain22.java. Here's the screenshot of the result.

![image](https://github.com/user-attachments/assets/4a29f2fe-efd9-4249-baae-b6ec9f9c9709)

![image](https://github.com/user-attachments/assets/c853489c-c002-49e8-b73f-0a585f40e8c4)

![image](https://github.com/user-attachments/assets/c70a4c69-62d8-4d9a-ac1b-546e91f66546)

![image](https://github.com/user-attachments/assets/1d12c91d-d55e-4879-accc-b15ccf575fe3)

![image](https://github.com/user-attachments/assets/20036b64-6083-433b-97dc-51500eeb1053)

![image](https://github.com/user-attachments/assets/b5112277-7741-4eab-80fd-a4fac22a0bed)
