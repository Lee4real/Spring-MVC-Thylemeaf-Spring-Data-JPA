# Project Title

This is a Java-based web application developed using the Spring Boot framework and Maven for dependency management. The application is designed to manage patient data.

## Technologies Used

- Java: The backend logic of the application is written in Java.
- Spring Boot: This is the main framework used for developing the application.
- Maven: This is the build automation tool used for managing dependencies.

## Application Structure

The application consists of several HTML templates located in the `src/main/resources/templates` directory. These templates are used to render the user interface of the application.

- `patients.html`: This template is used to display a list of patients. It includes a form for searching patients by keyword and a table for displaying the patient data. Each row in the table represents a patient and includes an ID, name, date, disease status, and score. There are also options to delete or edit each patient's data.

- `template1.html`: This is a general template that includes a navigation bar with links to the home page and a dropdown menu for patient-related operations. It also includes a search form.

## Setup

To run this project, you will need to have Java and Maven installed on your machine. You can then clone the repository and navigate to the project directory. From there, you can run the application using the following command:

```bash
mvn spring-boot:run
```


## Usage

Once the application is running, you can access it by navigating to `http://localhost:8080` in your web browser. From there, you can view and manage patient data using the provided interface.

## License

This project is licensed under the MIT License 

