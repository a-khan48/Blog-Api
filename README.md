Blog Platform API - 

This project consist of a blog built using RESTful API, Built upon the Spring framework, A user can create, read, update, and delete posts on a localhost server.

Steps:

- Clone this repository into a project folder
- After you clone the repository, open the project using your preferred IDE
- Run the BlogPlatformHWApplication java class.
- Open the Blog using "http://localhost:8080", it should display an empty page for now.
- After running the class, navigate to the BlogPostController class
- In the "@RequestMapping" line of the program, navigate to the actions menu, which is labeled under the Earth symbol next to "/post"
- In the dropdown menu, hit "Generate request in HTTP client"
- After pressing that button, you should be transferred to a notepad where you can type various GET, POST, PUT, and DELETE commands.
- The notepad should already be populated with an HTTP request, however, for the sake of reducing complications, delete anything you see in this text prompt and paste these commands inside the brackets to verify functionality of the blog:
[
###
GET http://localhost:8080/posts

<> 2023-07-05T210706.200.json
<> 2023-07-05T210620.200.json
<> 2023-07-05T210514.200.json
<> 2023-07-05T210425.200.json


###
POST http://localhost:8080/posts
Content-Type: application/json


{
  "title": "The first post",
  "content": "Hallo! This is the first post!",
  "author": "John Doe"
}

<> 2023-07-05T210707.201.json
<> 2023-07-05T210620.201.json
<> 2023-07-05T210514.201.json
<> 2023-07-05T210426.201.json


###
PUT http://localhost:8080/posts/1
Content-Type: application/json

{
  "title": "Updating the first post!",
  "content": "This post is under construction...",
  "author": "John Dough"
}

<> 2023-07-05T210707.200.json


###
GET http://localhost:8080/posts

<> 2023-07-05T210707-1.200.json
<> 2023-07-05T210621.200.json
<> 2023-07-05T210514-1.200.json
<> 2023-07-05T210426.200.json



###
POST http://localhost:8080/posts
Content-Type: application/json


{
  "title": "The Second Post",
  "content": "This is the second post!",
  "author": "John Doe"
}

<> 2023-07-05T210707-1.201.json
<> 2023-07-05T210621.201.json
<> 2023-07-05T210514-1.201.json
<> 2023-07-05T210426-1.201.json


###
GET http://localhost:8080/posts

<> 2023-07-05T210707-2.200.json
<> 2023-07-05T210621-1.200.json
<> 2023-07-05T210514-2.200.json
<> 2023-07-05T210426-1.200.json


###
DELETE http://localhost:8080/posts/1 
]

// Alternatively, you can write your own GET, PUT, POST, or DELETE commands as well. This is just to verify that all functions are working as intended.

- After you follow these steps, you can refresh http://localhost:8080 to find that a post under ID tag 2 is displayed.
- If this post is displayed and the IDE reports no errors after generating an HTTP request, then you have successfully used the blog!
