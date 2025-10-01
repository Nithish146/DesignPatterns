Observer Pattern in Java

Description
This project demonstrates the implementation of the Observer Design Pattern in Java. The Observer Pattern is used when changes in one object (the subject) need to be automatically reflected in other objects (the observers) without creating a tight coupling between them. In this example, a ProgressReport acts as the subject, and whenever a new report is generated for a student, all registered observers such as Teacher, Parent, and Admin are notified instantly. This ensures real-time updates and provides a clean, maintainable structure that adheres to good design principles.

Use Case
Whenever a student’s progress report is updated, all stakeholders like teachers, parents, and admins are notified automatically. This pattern is widely used in real-time systems, notifications, and event-driven applications to ensure consistent updates without tight coupling.

Files & Their Use

Observer.java → Interface that all observers implement.

ProgressReport.java → Subject that notifies observers when a report is generated.

Teacher.java → Observer that receives notifications.

Parent.java → Observer that receives notifications.

Admin.java → Observer that receives notifications.

Main.java → Entry point to run the program.

How to Run in VS Code

Open VS Code and create a new folder (example: ObserverPatternDemo).

Add all .java files inside this folder.

Open the integrated terminal and compile all files:

javac *.java


Run the main program:

java Main

Decorator Pattern – Quiz Question Example

Description
The Decorator Pattern is a Structural Design Pattern that allows dynamic addition of features to objects without modifying their core class. In this project, a quiz question is enhanced with extra functionalities such as hints, time limits, and gamification. This demonstrates flexibility, extensibility, and reusability in code while keeping the base class unchanged.

Use Case
In an e-learning platform, a simple question can be decorated with additional features such as hints for guidance, time limits to add challenge, and gamification to reward points and badges. This makes assessments interactive and motivating for learners.

Files & Their Use

Question.java → Interface for questions.

BaseQuestion.java → Core question implementation.

QuestionDecorator.java → Abstract decorator class used to extend question features.

HintDecorator.java → Adds hints dynamically to the question.

TimeLimitDecorator.java → Adds a time limit feature to the question.

GamificationDecorator.java → Adds points and badges for gamification.

Main.java → Runs the demo by combining all decorators and displaying the output.

How to Run in VS Code

Open VS Code and create a project folder.

Add all .java files inside the folder.

Compile the code:

javac *.java


Run the main class:

java Main

Adaptive Learning Paths (Strategy Pattern)

Description
Adaptive Learning Paths is a Java project that personalizes student learning by assigning problems of varying difficulty (Easy, Medium, Hard) based on performance scores. It uses the Strategy Pattern to dynamically switch strategies without changing core logic. This ensures students get the right level of challenge and support. The system is simple, extendable, and suitable for adaptive education platforms.

Use Case
Online learning platforms or tutoring apps can use this system to assign problems based on student performance. Students with lower scores receive easier problems, average students get medium difficulty, and high performers are challenged with advanced problems. The difficulty updates dynamically when a student’s performance changes.

Files & Their Use

LearningStrategy.java → Interface for learning strategies.

EasyStrategy.java → Strategy for assigning easy problems.

MediumStrategy.java → Strategy for assigning medium difficulty problems.

HardStrategy.java → Strategy for assigning challenging problems.

Student.java → Represents a student, holds performance score, selects strategy.

Main.java → Entry point of the program (runs the demo).

How to Run in VS Code

Open VS Code and create a folder for the project.

Add all .java files inside.

Compile the code:

javac *.java


Run the program:

java Main

Assessment Manager (Singleton Pattern)

Description
This project demonstrates the Singleton Design Pattern. The AssessmentManager ensures there is only one central manager to handle assessments, reports, rewards, and notifications. This prevents duplicate managers, keeps data consistent, and supports scalability in an educational system. It reflects real-world EduTech platforms where a single assessment engine manages all tests and reports.

Use Case
The Singleton ensures one global source of truth for student assessments. It manages adaptive tests, generates reports, assigns badges, and notifies progress. This avoids conflicts and provides consistent results for students, teachers, and parents.

Files & Their Use

AssessmentManager.java → Core Singleton class (only one instance allowed).

StartAssessment.java → Handles starting adaptive assessments.

GenerateReport.java → Generates performance reports.

AssignBadge.java → Assigns gamification badges.

NotifyProgress.java → Sends progress notifications.

Main.java → Driver class to demonstrate all features.

How to Run in VS Code

Open the project folder in VS Code.

Ensure all files are in the package: Exercise1.DesignPatterns.Creational.Singleton

Compile all files:

javac Exercise1/DesignPatterns/Creational/Singleton/*.java


Run the program:

java Exercise1.DesignPatterns.Creational.Singleton.Main



Factory Method Pattern

Description
The Factory Method Pattern is used to create objects without exposing the creation logic. In Ei ASSET, the test engine generates different types of questions (MCQ, True/False, Comprehension, etc.) dynamically at runtime. This pattern simplifies object creation, keeps the code clean, and allows easy extension for new question types.

Use Case
Ei ASSET Test Engine generates various types of questions for online tests dynamically. The pattern hides object creation details and allows the engine to create questions without depending on specific classes.

Files & Their Use

Question.java → Interface for all question types.

MCQQuestion.java → Represents a Multiple Choice Question.

TrueFalseQuestion.java → Represents a True/False Question.

ComprehensionQuestion.java → Represents a Comprehension Question.

QuestionFactory.java → Abstract factory class defining the creation method.

MCQFactory.java → Factory for creating MCQQuestion objects.

TrueFalseFactory.java → Factory for creating TrueFalseQuestion objects.

ComprehensionFactory.java → Factory for creating ComprehensionQuestion objects.

Main.java → Client class that uses the factories to generate questions and display them.

How to Run in VS Code

Open VS Code and open the project folder containing all Java files.

Compile all files:

javac *.java


Run the main program:

java Main




Strategy Pattern in Java

Description
This project demonstrates the Strategy Design Pattern in Java. It shows how different difficulty levels (Easy, Medium, Hard) can be applied dynamically. Instead of using conditional logic, strategies are interchangeable and selected at runtime. This makes the system flexible, maintainable, and easy to extend with new strategies.

Use Case
A student can receive Easy, Medium, or Hard questions depending on performance. Weak students get Easy questions, average students get Medium questions, and strong students get Hard questions. The AdaptiveStrategy automatically selects difficulty based on the student’s score, making the system dynamic.

Files & Their Use

QuestionStrategy.java → Interface for all strategies.

EasyStrategy.java → Provides Easy-level questions.

MediumStrategy.java → Provides Medium-level questions.

HardStrategy.java → Provides Hard-level questions.

AdaptiveStrategy.java → Chooses Easy/Medium/Hard dynamically based on student performance.

StudentContext.java → Maintains the current strategy and calls it.

MindsparkApp.java → Main class to run the program and demonstrate the Strategy Pattern.

How to Run in VS Code

Open VS Code and create a new Java project folder.

Add all .java files inside the folder.

Compile all files:

javac *.java


Run the main class:

java Main