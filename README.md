# 🎓 Kotlin Student Records

Mini Kotlin system to manage student records using **core collections** and **higher-order functions**.  
This task demonstrates manipulation of `List`, `Set`, and `Map`, alongside transformations using `map`, `filter`, `reduce`, and `fold`.

---

## 📝 Task Brief

In this challenge, you're building a mini system to manage student records using Kotlin collections.  
You’ll use arrays, lists, sets, and maps to store data, and apply higher-order functions to transform and filter it.

This task tests your ability to:

- ✅ Use Kotlin’s core collection types (`List`, `Set`, `Map`, and their mutable variants)
- ✅ Traverse and manipulate collections using `forEach`, `map`, `filter`, `reduce`, and `fold`
- ✅ Write clean and expressive collection logic that mirrors real-life data workflows

---

## ✅ Requirements & Implementation

### 📌 Requirement 1: Create and Populate Collections

- List of student names (immutable + mutable)
- Map of student scores
- Set of graduated students (immutable + mutable)
- Usage of different collection types

<img src="screenshots/Requirement 1.png" alt="Requirement 1 Output" />

---

### 📌 Requirement 2: Looping and Searching

- Loop through names and print
- Get score for specific students
- Skip printing any student who already graduated

<img src="screenshots/Requirement 2.png" alt="Requirement 2 Output" />

---

### 📌 Requirement 3: Transforming and Filtering

- Convert names to UPPERCASE using `map`
- Filter students who scored above 80
- Chain: `filter → map → forEach`

<img src="screenshots/Requirement 3.png" alt="Requirement 3 Output" />

---

### 📌 Requirement 4: Reducing and Aggregation

- Use `reduce` to calculate total score
- Use `fold` to build string like:  
  `"Ahmed: 85 | Laila: 72 | Nour: 95"`

<img src="screenshots/Requirement 4.png" alt="Requirement 4 Output"/>

---

### 📌 Requirement 5: Mini Scenario – Student Report Generation

- Function accepts `Map<String, Int>`
- Filters students who passed (score ≥ 60)
- Transforms into `"StudentName: Grade"` format
- Prints each line
- Handles empty input gracefully

<img src="screenshots/Requirement 5.png" alt="Requirement 5 Output"/>

---

## 📌 How to Run

1. Clone this repo.
2. Open in IntelliJ / any Kotlin IDE.
3. Run `Main.kt`.
4. View printed output in console and compare with screenshots.

---

## 🧑‍💻 Developed by
**[`Ahmed Samy`](https://github.com/AhmedSamy02)**
