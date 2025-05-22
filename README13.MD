|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #13 Double Linked Lists

## 12.2.1 Experiment 1 - Actuvity 1
### Verification Experiment Result
The solution is implemented in Student.java, Node.java, DoubleLinkedLists.java and DoubleLinkedListsMain.java. 

Below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/f1ccd8f1-62bd-4cfe-ae46-ec54040d6268)


## Answers to Questions
1. Difference between singly and doubly linked lists:
A singly linked list has nodes that only point to the next node, while a doubly linked list has nodes that point to both the next and previous nodes, allowing traversal in both directions.
2. Purpose of next and prev attributes in Node class:
next points to the next node in the list, while prev points to the previous node, enabling bidirectional traversal.
3. Purpose of the constructor in DoubleLinkedLists class:
It initializes head and tail to null, ensuring the list starts empty.
4. Meaning of if(isEmpty()){ head = tail = newNode; } in addFirst():
If the list is empty, the new node becomes both the head and tail.
5. Meaning of head.prev = newNode in addFirst():
It sets the previous pointer of the current head to the new node, linking them.
6. Meaning of current.next.prev = newNode in insertAfter():
It ensures the new node is correctly linked to the next node in the list.
7. Traversal process in the experiment:
Implemented in the print() method using temp = temp.next, which moves through the list.
8. Purpose of if(temp == tail){ addLast(data); } in insertAfter():
If the key is found at the tail, the new node is added at the end.
9. Purpose of if(temp.data.nim.equalsIgnoreCase(key)) in insertAfter():
It checks if the current node contains the specified key before inserting a new node.


## 12.3.1 Experiment 1 - Activity 2
### Verification Experiment Result
The solution is implemented in Student.java, Node.java, DoubleLinkedLists.java and DoubleLinkedListsMain.java, that have been implemented. 

Below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/75d58b9f-238d-4879-adea-2ddebe45be66)

## Answer to Question
1. Purpose of head = head.next; head.prev = null;:
- Moves head pointer to next node and removes reference to old head
- Sets new head's prev to null to maintain list integrity
2. Importance of else if(head == tail){ head = tail = null; }:
- Handles special case when list has only one node
- Ensures proper cleanup when removing the only node
3. Approach without tail attribute:
- Would need to traverse from head to find last node before removal
- Would be less efficient (O(n) vs O(1) with tail)
4. Purpose of initial if(isEmpty()) check:
- Prevents operations on empty list
- Provides appropriate error message
5. Handling removal at beginning and end:
- For index 0: calls removeFirst()
- For last node: calls removeLast()
- Both handle their special cases appropriately
6. Updating middle node links:
- temp.prev.next = temp.next bypasses temp from previous node
- temp.next.prev = temp.prev bypasses temp from next node
7. Added index validation:
- Added checks for negative index and index exceeding size
- Added appropriate error messages


## Assignments
The solution is implemented in Student.java, Node.java, DoubleLinkedLists.java and DoubleLinkedListsMain.java.

![Image](https://github.com/user-attachments/assets/9b9e87f1-931c-4652-bb2c-6e0e89c977ef)

Brief Explanation:
1. All basic operations (addFirst, addLast, isEmpty)
2. All assignment methods:
    - add(index, data) - Insert at specific position
    - removeAfter(key) - Remove node after specified key
    - getFirst(), getLast(), get(index) - Data retrieval
    - size() - Returns list size
    - indexOf(key) - Finds position by NIM
3. Proper error handling
4. Size tracking
5. Comprehensive test cases
