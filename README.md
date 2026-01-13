# Hotel Management System (Java OOP):

A professional, object-oriented implementation of a **Hotel Management System**, developed as part of the Software Construction (CCP) course. This project follows an incremental development model, strictly aligned with UML Figure 18 and industry-standard defensive programming practices.

## Project Overview:

The system is designed using core OOP principles to manage hotels, rooms, guests, reservations, and payments in a robust and scalable manner. Each module was developed and verified incrementally to ensure structural integrity, logical correctness, and full UML compliance.

## Key Features:

* **Hotel Hierarchy:** Manage multiple hotels under a centralized HotelChain controller. Maintain separate customer registries for each hotel.
* **Structural Associations:** Handles RoomType specifications, costs, and real-time room states (FREE, RESERVED, OCCUPIED).
* **Payment & Identity Logic:** Dedicated Guest class for customer identity
* **ReserverPayer class:** For handling secure payment responsibilities
* **Advanced Association Class:** Utilizes HowMany to manage the quantitative link between reservations and room requirements.
* **Defensive Programming:** High-level robustness using IllegalArgumentException and NullPointerException for data validation and logical date constraints.

## Technology Stack:

* **Language:**	Java (JDK 8+)
* **Testing:** JUnit 4
* **Tools:** VS Code, Git, GitHub
* **Design Concepts:** Encapsulation, Association Classes, HashMap-based retrieval

## Project Roadmap & Incremental Development:

The project was developed across 12 structured versions, ensuring correctness at each stage.

| Day	    | Version Focus | Area	                 | Key Implementation Details                                         |
| :-------: | :-----------: | :--------------------: | :--------------------------------------------------------------:  |
| **Day 1** | V1	        | Core Skeleton	Initial  | Creation of Room, RoomType, and Hotel classes                      |
| **Day 1** | V2	        | Qualified Associations | Implemented ReserverPayer and Reservation with specialized links |
| **Day 1**	| V3	        | State Machine Logic	 | Integrated room states (FREE, RESERVED, OCCUPIED)                  |
| **Day 1**	| V4	        | Communication Logic	 | Communication between HotelChain and Hotel                         |
| **Day 1**	| V5	        | Object Linking	     | Complete reservation workflow and object linking                   |
| **Day 1**	| V6	        | Guest Management	     | Guest handling and check-in logic                                  |
| **Day 1**	| V7	        | Logic Verification	 | Added Main class and resolved logical issues                       |
| **Day 1**	| V8	        | System Content	     | Finalized README and core documentation                            |
| **Day 2**	| V9	        | UML Compliance	     | Full structural compliance with UML Figure 18                      |
| **Day 3**	| V10	        | Workflow Verification	 | Verified full workflow via Main execution                          |
| **Day 4**	| V11	        | Quality Assurance	     | Full JUnit 4 testing with zero warnings                            |
| **Day 5**	| V12	        | Defensive Logic	     | Integrated exception handling                                      |

**Important Note:** Internal methods (e.g., canMakeReservation, canCheckInGuest) are preserved to maintain 100% UML compliance with the provided specification (Fig 18), even where they serve as placeholders for system maintenance logic.

## How to Run the Project:

1. **Clone the Repository:** git clone https://github.com/areej63921-blip/HotelManagementSystem.
2. **Open in VS Code:** Ensure Java Extension Pack is installed and enabled
3. **Run the Main Program:** Execute Main.java, You will observe two parts in the terminal:
    **PART A:** NORMAL SUCCESSFUL WORKFLOW (Successful booking, Room reservation, Guest check-in)
    **PART B:** DEFENSIVE TESTING (Null hotel handling, Empty guest name validation, Invalid date exception handling)
4. **Run Unit Tests:** Open the Testing tab in VS Code and run all JUnit 4 tests.

## Verification Status:

* **JUnit Results:** All tests passed (100% core logic verified)
* **Defensive Coverage:** Handles nulls and invalid inputs safely
* **UML Mapping:** Fully compliant with Figure 18
* **Code Quality:** Zero warnings, proper access modifiers

**Developed By:**
    Areej Imran
    Software Engineering Student
    Iqra University