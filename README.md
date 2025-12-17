# Apex Student Manager
A Java-based CLI tool I built to practice clean code and efficient data structures. It manages student records while focusing on performance and modular design.

## 🚀 Key Features
- **Instant Search:** I used a `HashMap` for storage to ensure that finding a student ID is nearly instantaneous ($O(1)$ time complexity).
- **Type Safety:** Uses Java Generics to handle data reliably and prevent runtime errors.
- **Modular Design:** I followed a "Model-Manager" pattern to keep the logic separate from the main user interface.

## 🛠️ Implementation Details
- **Encapsulation:** Used private fields and public getters to keep the student data secure.
- **Custom Formatting:** Overrode the `toString()` method in the Student class for clean, readable terminal output.
- **Error Handling:** The system handles scenarios where a student ID is not found without crashing.

## 📂 Quick File Guide
- `Student.java`: The core data model.
- `StudentManager.java`: Where the "heavy lifting" (storage and search logic) happens.
- `Main.java`: The CLI entry point for the user.