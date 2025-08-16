# University Management System

## 📌 Project Status
🚧 This project is **currently in progress**. Some features may not be fully implemented yet.

## 📝 Description
The University Management System is a desktop-based application designed to help universities manage students, faculty, courses, and related operations.  
It is built with **Java Swing** for the user interface and connected to a **MySQL database** for storing and retrieving data.  

The system aims to simplify administrative tasks such as adding, updating, and managing student and faculty records.

## 🔧 Features (In Progress)
- [x] Update student details (phone, email, nationality, enrollment, major, semester, etc.)
- [x] Update faculty details (phone, email, nationality, designation, employment type, etc.)
- [ ] Add/Delete student records
- [ ] Add/Delete faculty records
- [ ] Course management
- [ ] Fee management
- [ ] Database schema (SQL file) for setup
- [ ] Authentication & user roles (planned)

## 💻 Technologies Used
- **Java Swing** (GUI)
- **MySQL** (Database)
- **JDBC** (Java Database Connectivity)
- **Object-Oriented Programming (OOP)** principles


## 🚀 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/university-management-system.git

2. Compile the Java files:
   ```bash
   javac -d bin src/universitymanagementsystem/*.java

3. Run the program:
   - For Students:
   ```bash
   java -cp bin universitymanagementsystem.UpdateStudent
   ```
   - For Teachers:
   ```bash
   java -cp bin universitymanagementsystem.UpdateTeacher
   ```

4. Set up the MySQL database:
-  Install MySQL and create a database (e.g., universitydb).
-  Import the provided SQL schema (to be added soon).
-  Update the database connection settings in your `Conn.java` file.
  

📂 Project Structure
```bash
UniversityManagementSystem/
├── src/universitymanagementsystem/
│   ├── UpdateStudent.java
│   ├── UpdateTeacher.java
│   ├── Conn.java          # Database connection helper (MySQL + JDBC)
│   └── ... (other files coming soon)
├── README.md
```







