
# Mapping Practice

This is the code for practicing mapping, this contains various types of mappings as **One to One**, **One to Many**, **Many to One**, **Many to Many**.

This also uses **Relational Data** and **JPA** for data source



## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


# Data Flow

## Controller
-   *This section contains 5 classes which uses APIs as mentioned below* :

* ### AddressController Class

    * @PostMapping("address")
    * @GetMapping("address")
    * @DeleteMapping("address/{Id}")
    * @PutMapping("address/{landmark}/{Id}")

* ### BookController Class

    * @GetMapping("book")
    * @PostMapping("book")
    * @DeleteMapping("book/{Id}")
    * @PutMapping("Book/{Title}/{Id}")

* ### CourseController Class

    * @GetMapping("course")
    * @PostMapping("course")
    * @DeleteMapping("course/{Id}")
    * @PutMapping("course/{duration}/{Id}")

* ### LaptopController Class

    * @GetMapping("laptop")
    * @PostMapping("laptop")
    * @DeleteMapping("laptop/{Id}")
    * @PutMapping("laptop/{price}/{Id}")
 
* ### StudentController Class
    * @GetMapping("student")
    * @PostMapping("student/{students}")
    * @DeleteMapping("student/{Id}")
    * @PutMapping("student/{name}/{Id}")

## Services
-  *This section contains 5 classs with functions that helps API to perform their specific tasks* : 

* ### AddressService Class

    * List<Address> getAddress() 
    * postAddress(List<Address> addresses)
    * String deleteAddress(Long id)
    * String updateLandmark(String landmark, Long id)

* ### StudentService Class

    * List<Student> getStudent()
    * postStudent(List<Student> students)
    * String deleteStudent(Long id)
    * String updateName(String name, Long id)

* ### LaptopService Class

    * List<Laptop> getLaptop()
    * postlaptop(List<Laptop> laptops)
    * deleteLaptop(Long id)
    * updatePrice(Integer price, Long id)

* ### CourseService Class
    
    * List<Course> getCourse()
    * postCourse(List<Course> courses)
    * deleteCourse(Long id)
    * updateTitle(String duration, Long id)  

* ### BookService Class
    
    * List<Book> getBooks()
    * String postBook(List<Book> books)
    * String deleteBook(Long id)
    * String updateTitle(String title, Long id)

## Model
- *This section contains 5 models as required by project named **Student**, **Address**, **Book**, **Laptop**, **Course**. Each have their relative datamembers in them which will be used as columns to store their respective data*.    

##  Repository
- *This section contains 5 **Interfaces** named IStudentRepo, IAddressRepo, IBookRepo, ILaptopRepo, ICourseRepo*

- *All of these extends JpaRepository Interface*.


## Database Design
- *In this section we used the models as mentioned in Model section, which are used as a table to store data*.
- *It also uses **Relational Database** and **JPA** to create datastructure*.
- *We use **MYSQL** which is a management system for relational data*

## Data Structure Used

- *We used **Relational database** along with **JPA** as the data source in this project*.

- *Relational Data is stored in form of tables which further can be connected via various types of mappings/relations, such as One to One, One to Many, etc*.

- *This kind of data persists forever and we use **SQL** to manipulate this data via MYSQL.*

- *Here we also used the concept of **Mapping** which uses **Foreign Keys** to define relation between 2 tables.*
## Summary

*This project performs the task of managing Orders with various types of API's like **Get, Post, Put, Delete***.

*This project is also connected to a relational data which is the data source of this project.*

*We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.*


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)


