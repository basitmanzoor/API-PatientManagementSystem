# API-PatientManagementSystem

This is a RESTful API for managing patient information. It allows you to add new patients to the system and retrieve information about existing patients.

# Technologies Used
This API is built using the following technologies:

1. Java
2. Spring Boot
3. Maven

# API Endpoints
<strong>POST /addPatientViaParameters</strong>
<strong>POST /addPatientViaRequestBody</strong>
These endpoints allows you to add a new patient to the system.

<strong>Request Body</strong>
The request body should be a JSON object with the following properties:
<ul>
<li>patientId (integer): The patient ID of the patient</li>
<li>name (string): The name of the patient</li>
<li>wardNumber (string): The ward number of the patient</li>
<li>address (string): The address of the patient</li>
<li>disease (string): Disease of the patient</li>
<li>age(integer): The age of the patient</li>
</ul>

<strong>GET /getPatienttInfo</strong>
This endpoint allows you to retrieve information about a patient.

# Query Parameters
The following query parameter is required:

<strong>patientId (integer)</strong>: The roll patientId of the patient you want to retrieve information for

# Running the API Locally
To run this API locally, you will need to have Java and Maven installed on your system. Follow these steps:

1. Clone this repository to your local machine
2. Navigate to the project directory
3. Run the command mvn spring-boot:run
4. The API will be accessible at http://localhost:8080

# Contributing
If you find any issues or have suggestions for improving this API, feel free to open an issue or submit a pull request.
