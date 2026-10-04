# Software Design Patterns: Assignment #3 — Bridge Pattern

## Project Overview
The project models the relationship between Computers and Cooling Systems. By applying the Bridge pattern, high-level computer operations (abstraction) are decoupled from low-level cooling hardware implementations (implementor). This design allows computers and cooling mechanisms to vary independently and enables dynamic switching of cooling systems at runtime.

## Clean Code Principles Justification

### Clear Separation of Responsibilities (SRP): 
Abstraction classes (Computer, GamingPC) handle high-level computer operations, while implementation classes (AirCoolingSystem, LiquidCoolingSystem) strictly manage cooling hardware logic.
### Open/Closed Principle (OCP) & Backward Compatibility:
Adding a new cooling system (e.g., CustomLoopCooling) or a new PC type (e.g., ServerPC) requires no modification to existing abstractions or implementations.
### Dependency Inversion Principle (DIP):
High-level modules (Computer) do not depend on low-level modules (AirCoolingSystem); both depend on the interface abstraction (CoolingSystem).
### Meaningful Naming:
Domain-specific and structural pattern roles are explicitly named without ambiguity (CoolingSystem, GamingPC, executeHeavyTask).
### No Duplicated Logic (DRY):
Dynamic cooling switching (setCoolingSystem) and property management are encapsulated centrally within the Computer superclass.


