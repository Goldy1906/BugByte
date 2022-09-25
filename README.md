<br />
  <h1 align="center">BugByte</h1>
  <p align="center">
    <a href="">View </a>
  </p>
</p>

## ✨ Features

- Project Management
- Bug Management

## Tech Stack

| Stack    | -                                                                                                                                                                                 | -                                                                                                                                                                           | -                                                                                                | -                                                                                                                | -                                                                                                   |
| -------- | --------------------------------------------------------------------------------------------------                                                                                | -------------------------------------------------------------------------------------------------                                                                           | ------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| FrontEnd | <p align="center"><br />HTML</p>  | <p align="center"> <br />CSS</p>  | <p align="center"> <br />JavaScript</p>   | <p align="center"> <br />...</p> | <p align="center"> <br /></p>
| BackEnd  | <p align="center"> <br />Structured Query Language</p>     | <p align="center"><br />...</p> | <p align="center"> <br />...</p> | <p align="center"> <br />...</p>               | <p align="center"> <br />...</p> |


## :rocket: Quick start

# Application presentation and flow:
## I - Authentication
Since the core application is protected through authentication, the first page you will be directed to will be the register page.
<img src="">

Once you have registered, a backend service will check if you are an authorised user or not. Upon succesful authentication, you will be then directed to login page.
<kvb>
  <img src="">
</kvb>
<br/>

# II - The application :fire:

<br/>

## Home Page

...
<br/>
<br/>

### Project Manager    
  If the user is logged in as a Project Manager, he/she will have the option to create new project and assign a team to it and view the bugs reported for each project. <br/>

   <kbd>    <img src=""/></kbd>

   <br/>
  Upon clicking on the project name, the project manager will be redirected to a new page, on which he/she can view the project details. The project details that are displayed are:
  - <ins>Project ID</ins>: Every project is assigned a unique ID.
  - <ins>Project Name</ins>
  - <ins>Description</ins>: A description of the project.
  - <ins>Start Date</ins>: The start date of the project.
  - <ins>Status</ins>: In Progress/Completed.
  <kbd>    <img src=""/></kbd>

### Developer
If the user is logged in as a Developer, he/she will have the view to the assigned projects and the bugs reported for each project. The developer can mark a bug for closing.<br/>

### Tester
If the user is logged in as a Tester, he/she will have the view to the assigned projects and the option to report new bug to project.<br/>
<br/>
  Upon clicking on the report bug button, the tester will be redirected to a form which needs to be filled for reporting the bug. The form includes the following fields:
  - <ins>Bug ID</ins>: Every bug is to be assigned a unique ID.
  - <ins>Title</ins>
  - <ins>Description</ins>: A description of the bug.
  - <ins>Project ID</ins>: The id of the project for which the bug is reported.
  - <ins>Created By</ins>: The id of the tester reporting the bug.
  - <ins>Open Date</ins>: The date on which bug was reported.
  - <ins>Assigned By</ins>: The id of the PM assigning the bug.
  - <ins>Closed By</ins>: The id of the developer closing the bug.
  - <ins>Closed On</ins>: The date on which bug was closed.
  - <ins>Status</ins>: Open/Closed.
  - <ins>Severity Level</ins>: Critical/Major/Minor/Trivial.
  <kbd>    <img src=""/></kbd>

  
  
---
