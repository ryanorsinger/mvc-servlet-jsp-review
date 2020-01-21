#  Model-View-Controller Review with Servlets, DAOs, and JSPs

## General Diagram of MVC w/ Servlets and DAOs
![ MVC Diagram](MVC-Servlets-DAO-Diagram.png)

## Relationships between Requests and Servlets
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

## Guidance, Best Practices, and Conventions
- One Servlet per URL
- One URL per new Page
- One DAO per database table
- One model per entity/table. Each instance of a model represents a row from a table, a single entity.

## How to Use This Repository
- This `README.md`
- [MVC-Servlets-DAO-Diagram](./MVC-Servlets-DAO-Diagram.pdf) is a general diagram of how a request maps to a servlet and how a servlet communicates with DAOs.
- [Specific-MVC-Servlets-DAO-Diagram](./Specific-MVC-Servlets-DAO-Diagram.pdf) is a specific diagram of the functionality of requesting a random quote. This diagrams the request-response for
- [This Handout](./handout.pdf) features the table relating endpoints and request typs to the specific servlet and method they fire.
- The diagrams and handout are ready to print!

## Getting the code to run
- Copy `git@github.com:ryanorsinger/mvc-servlet-jsp-review.git` to your clipboard.
- Open IntelliJ, Go to New->Project->From Version Control->Git
- Paste in `git@github.com:ryanorsinger/mvc-servlet-jsp-review.git` to clone the source and setup the IntelliJ project
- Right click `pom.xml`, and ensure that IntelliJ knows this is a Maven project
- Run the `.sql` files from inside of `src/sql/` in the following order:
    1. Run `create_database.sql` to create the `reviewlister_db` database, create the `reviewlister_user`, and specify their permissions.
    2. Run `quotes_migration.sql` to create the quotes table
    3. Run `quotes_seeder.sql` to populate the quotes table with some quotes.
 - Specify the Java SDK to make sure that IntelliJ knows
 - Ensure that you've configured Tomcat with IntelliJ. For detailed instructions, see [https://java.codeup.com/appendix/further-reading/java/intellij-tomcat-configuration](https://java.codeup.com/appendix/further-reading/java/intellij-tomcat-configuration) 
 - Finally, go to Run->Run to launch the web application in your browser.
 - Navigate to `/quotes/` to see the index of all quotes.
 - Navigate to `/quotes/random` to see a random quotation.