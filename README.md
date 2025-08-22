# 🧪 Page Object Model Framework in Selenium

This repository showcases a modular test automation framework built using **Java**, **Selenium WebDriver**, and the **Page Object Model (POM)** design pattern. It was developed from scratch to demonstrate practical implementation of POM principles while testing a live website.

## 🚀 Project Highlights

- ✅ Built using **Java + Selenium WebDriver**
- 🧩 Implements **Page Object Model** for clean separation of test logic and UI interactions
- 🔍 Designed for **scalability**, **maintainability**, and **reusability**
- 🧪 Includes test cases for login, navigation, and checkout flows
- 📦 Structured for easy integration with CI tools and test reporting

## 📁 Folder Structure

Page-Object-Modelling/ ├── src/ │ └── test/ │ └── java/ │ ├── pages/ # Page classes (e.g., LoginPage.java, CheckoutPage.java) │ └── tests/ # Test classes (e.g., LoginTest.java) ├── pom.xml # Maven dependencies └── README.md # Project documentation

Code

## 🧠 Technologies Used

- **Java 11+**
- **Selenium WebDriver**
- **TestNG** (optional for test orchestration)
- **Maven** (for dependency management)

## 🛠️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/mughdabansal/Page-Object-Modelling.git
Navigate to the project folder:

bash
cd Page-Object-Modelling
Run tests using your IDE or Maven:

bash
mvn test
📌 Key Concepts Demonstrated
Encapsulation of page elements and actions

Separation of concerns between test logic and UI structure

Use of locators and reusable methods

Scalable structure for adding new test flows

🌐 Tested Website
This framework was applied to a live demo site (e.g., Swag Labs) to validate login, product selection, and checkout functionalities.

🧭 Future Enhancements
Integrate BrowserStack for cross-browser testing

Add reporting with ExtentReports or Allure

Implement data-driven testing using Excel or JSON

Explore risk-based testing strategies for feature prioritization

👩‍💻 Author
Mughda Bansal Detail-oriented QA engineer and software developer blending technical mastery with creative presentation. 📌 Passionate about automation, design, and ethical tech.

Code

4. Save the file and commit it:
```bash
git add README.md
git commit -m "Added detailed README with framework overview"
git push origin main
