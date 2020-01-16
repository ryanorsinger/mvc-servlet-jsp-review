# Reviewing Model-View-Controller Implementation with Servlets, DAOs, and JSP


## General Diagram of MVC w/ Servlets and DAOs
![MVC Diagram](MVC-Servlets-DAO-Diagram.png)

| What it does                    | Endpoint            | Request Type | Method   | Servlet            |
| ------------------------------- | ------------------- | ------------ | -------- | ------------------ |
| Show an index of all quotes     | /quotes             | GET          | doGet()  | QuotesIndexServlet |
| Load the quote creation page    | /quotes/create      | GET          | doGet()  | CreateQuoteServlet |
| Save the submitted quote        | /quotes/create      | POST         | doPost() | CreateQuoteServlet |
| Show a random quote             | /quotes/random      | GET          | doGet()  | RandomQuoteServlet |
| Show quote w/ id 5              | /quotes/show?id=5   | GET          | doGet()  | ShowQuoteServlet   |
| Load quote 5 to edit            | /quotes/edit?id=5   | GET          | doGet()  | EditQuoteServlet   |
| Save the updated edits to quote | /quotes/edit        | POST         | doPost() | EditQuoteServlet   |
| Delete a quote #5               | /quotes/delete?id=5 | POST         | doPost() | DeleteQuoteServlet |


## Request Inspector Example
GET to /request-inspector
- Servlet reads all the request information
- Wire up those variables to the view
- The .jsp should output those request 
- The .jsp should also have an example form that posts to 
- This .jsp should have some example pre-built anchor tags

POST to /request-inspector
- Write po
request-inspector.jsp


https://github.com/CodeupClassroom/yosemite-adlister/blob/master/src/main/java/QuotesDao.java

Quotes 
    DAO
    Servlet
        /quotes/all
        /quotes/random
        /quotes/create
    Views
        Index
        Show
        Create


Each quote has author and quote properties

Make database for `reviewlister_db`
`Config.java`
reviewlister_db
reviewlister_user


## TODOs
- Add specific Quotes resource example to the entire app
- Add specific Quotes MVC diagram
- Create reviewlister_db, reviewlister_user, setup permissions
- Create Config.java file
- Create a migration for creating the quotes table
- Move the existing quotes to a SQL seeder file
- Update readme with project setup instructions for students to be able to clone and get started.