# Spring Boot + JPA + MySQL to avoid recursion

It's just that... In this example you can find some of most typical issues working with Spring + JPA + MySQL to avoid recursion.

We will work with the following example:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/ERDiagram.png)

## Getting Started

For the initial steps give a try to my following video for the basics of Spring:
https://www.youtube.com/watch?v=DvzGf0cAlg4

It's a step by step guide to understand how to make a Spring project implementing RESTFul and JPA accessing MySQL.

For this project please read the links at the bottom of this README.md file which explain the following annotations:
* @JsonIgnore, to avoid recursion.
* @JsonManagedReference and @JsonBackReference, to avoid recursion.
* @JsonProperty, to show data previously ignored with @JsonIgnore, or, @JsonManagedReference and @JsonBackReference.

### For the most impatient learners

Clone this project:

````
git clone https://github.com/tcrurav/SpringJPAExample.git
````

Open the backend with Eclipse and change the backend/src/main/resources/application.properties according to your database credentials.

Now you can start your backend project.

And after that create with POSTMAN a doctor:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/createDoctor.png)

Now create with POSTMAN a patient:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/createPatient.png)

Now create with POSTMAN a prescription:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/createPrescription.png)

And after that assign with POSTMAN a Patient to a Doctor:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/AddPatientToDoctor.png)

Now you can see the doctors:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/doctors.png)

Now you can see the patients:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/patients.png)

Now you can see the prescriptions:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/prescriptions.png)

Now you can see the patients of doctor with id 3:

![screenshots](https://github.com/tcrurav/SpringJPAExample/blob/master/screenshots/patientsOfDoctor3.png)

There are a lot of more tests you can accomplish like creating a user with other role and test what he/she can access and not.

Enjoy!!!

### Prerequisites

All you need is... some time and...
* Eclipse IDE.
* STS 4, installed through the Eclipse Marketplace.
* MySQL Workbench, to host the database also included in the project.
* PostMan, for the RESTFul tests.
* More hours than you first could think of...

## Built With

* [Eclipse IDE](https://www.eclipse.org/ide/) - The IDE used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Tools 4](https://spring.io/tools) - The framework used
* [MySQL Workbench](https://www.mysql.com/products/workbench/) - The Database used

## Acknowledgments

* https://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion.
* https://www.baeldung.com/jackson-annotations.
* https://www.baeldung.com/hibernate-one-to-many.
* https://www.baeldung.com/jpa-many-to-many.
* https://www.getpostman.com/. Used to test the RESTFul end points of the project.
* https://gist.github.com/PurpleBooth/109311bb0361f32d87a2. A very complete template for README.md files.