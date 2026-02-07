# Design Notes

## Why ArrayList Instead of Array

ArrayList was used instead of arrays because:

- Dynamic resizing is supported automatically
- Easier addition and removal of elements
- Built-in utility methods such as:
    - add()
    - removeIf()
    - stream()
- Cleaner and more readable code
- Suitable for in-memory application data storage

Arrays have fixed size which makes them less flexible for dynamic data.

---

## Where Static Members Were Used and Why

Static members were used in the IdGenerator utility class.

Example:
- private static int studentIdCounter
- private static int courseIdCounter
- getNextStudentId()
- getNextCourseId()

Reasons:
- IDs must be unique across all objects
- Static variables maintain shared state
- Utility behavior does not require object creation
- Centralized ID generation logic improves maintainability

---

## Where Inheritance Was Used and Benefits

Inheritance was implemented using:

Person (Base Class)
→ Student
→ Trainer

Benefits gained:
- Code reuse of common attributes like name and email
- Reduced duplication across classes
- Logical real-world modeling
- Easier future extensions
- Cleaner class hierarchy

---

## Clean Code Practices Followed

### Meaningful Method Names
Examples:
- addStudent()
- findCourseById()
- toggleCourseActive()
- enrollStudent()

Avoided unclear names like:
- fun1()
- doWork()

### Small Methods
- Services contain focused logic
- Main class handles only:
    - Menu display
    - Input reading
    - Calling services

### Separation of Concerns
- Entities → Data
- Services → Business Logic
- Main → User Interface

### Exception Handling
- Custom EntityNotFoundException used
- User-friendly error messages displayed
