## Getting Started

Follow these steps to set up and run the Training Center API on your local machine:



1. Build the project using Maven:
mvn clean install

2.Run the application:
mvn spring-boot:run

The application should now be running locally. You can access the API endpoints using a tool like Postman or by sending HTTP requests from your preferred client.
API Endpoints

POST /api/training-centers: Create a new training center. Send a JSON object with the following fields:
centerName (string, required): Name of the training center (max 40 characters).
centerCode (string, required): Unique identifier for the training center (exactly 12 alphanumeric characters).
address (object, required): Address details including detailedAddress, city, state, and pincode.
studentCapacity (integer): Maximum number of students the center can accommodate.
coursesOffered (array of strings): List of courses offered by the training center.
contactEmail (string): Email address of the contact person (validated if present).
contactPhone (string, required): Phone number of the contact person (validated).
GET /api/training-centers: Retrieve a list of all stored training centers.


Example JSON data that you can use to test the POST API using Postman:

{
  "centerName": "Example Training Center",
  "centerCode": "ABC123456789",
  "address": {
    "detailedAddress": "123 Main Street",
    "city": "Cityville",
    "state": "Stateville",
    "pincode": "12345"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Course A", "Course B", "Course C"],
  "contactEmail": "example@example.com",
  "contactPhone": "1234567890"
  }