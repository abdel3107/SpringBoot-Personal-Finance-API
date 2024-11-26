# 📱 Personal Finance Tracker API - Spring boot 

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Twilio](https://img.shields.io/badge/Twilio-F22F46?style=for-the-badge&logo=twilio&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

## 📋 Table of Contents
- [Overview](#overview)
- [Key Features](#key-features)
- [Project Structure](#project-structure)
- [Tech Stack](#tech-stack)
- [Installation & Setup](#installation--setup)
- [Environment Configuration](#environment-configuration)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [API Integration](#api-integration)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## 🖥️ Overview
This is the backend service for the Personal Finance Tracker App, designed to manage user authentication and provide secure API endpoints for the Flutter frontend. The backend is developed using Spring Boot and PostgreSQL, ensuring secure and scalable data handling.

## ✨ Key Features
- 📲 **User Authentication**: Phone number-based OTP verification and JWT authentication.
- 💸 **Expense Tracking**: Add, update, or delete income/expense records.
- 📊 **Budget Management**: Set budgets and get insights on spending habits.(coming soon)
- 📑 **Personalized AI Insights**: Analyze user data to provide actionable recommendations (coming soon).
- 📊 **Local Data Storage**: Uses **SQLite** for offline data storage.(coming soon)

---

## 📁 Project Structure
The project follows a **feature-based clean architecture**:

---

## 🛠️ Tech Stack
- **Java**
- **Spring boot**
- **Postgres**
- **Docker**(Will use for deployment)
- **Flutter** for front end (linked [here](https://github.com/abdel3107/Flutter-Personal-Finance-App))

---

## ⚙️ Installation & Setup

### Prerequisites
Ensure you have the following installed:

---

## 🚀 Usage
- **Sign Up / Login**: Register using your phone number and verify via OTP.
- 

---
## 📸 Screenshots
...


## 🔗 API Integration
To integrate these endpoints with your Flutter frontend, use the http package to send requests to the backend. Make sure to handle the JWT token properly for authenticated requests.
**Example in Flutter**
```bash
final response = await http.post(
  Uri.parse("http://<your-ip>:8080/api/v1/auth/authenticate"),
  body: jsonEncode({
    "phoneNumber": phoneNumber,
    "password": password,
  }),
  headers: {"Content-Type": "application/json"},
);
```
---

### 📡 Front end
Refer to [Front end flutter](https://github.com/abdel3107/Flutter-Personal-Finance-App) repo 

---

## 🤝 **Contributing**
We welcome contributions to improve this project! If you'd like to contribute, please follow these guidelines:

### How to Contribute
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Make your changes and commit:
   ```bash
   git commit -m "Add your message"
   ```
4. Push to you branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Create a pull request, and we'll review it as soon as possible.


---

## 📄 **License**
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.


## 📬 Contact

For any questions or feedback, feel free to reach out:

- **Pouotouo Abdel Zidane**
  - Email: [abdelzidane3107@gmail.com](mailto:abdelzidane3107@gmail.com)
  - LinkedIn: [LinkedIn](https://www.linkedin.com/in/pouotouo/)
  - GitHub: [GitHub](https://github.com/abdel3107)

We appreciate your interest in this project and look forward to hearing from you!





