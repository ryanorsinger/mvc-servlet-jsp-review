# MVC Review w/ Servlets


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

### Review Questions 
- When do we need a new class?
- When do we need a new method? 
- Why start with MVC?
- Is MVC only a Java concept?
- When do we need a new DAO?
- Why do we use models, anyways?
- When should we make a new model?
- Why and when do we make new Servlets?
- Are there other architectural patterns other than MVC? 
- When do we make new views?


## What goes where?
- What goes where? 
- Ok, MVC... But what about things that aren't models or views or controllers?

#### Can't we put everything into one file?

- Yes you can. The Java compiler doesn't care. People do.
- MVC patterns sovle a pain point that you probably haven't seen yet!
