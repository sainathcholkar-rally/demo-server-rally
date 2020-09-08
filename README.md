Steps to run the server
1. sbt compile
2. sbt run



By default, server will run on 9000 port.

It has 2 apis,
1. http://localhost:9000/demoServer/login/:userId
   This api is used to authenticate the user
2. http://localhost:9000/demoServer/details/:userId
   This api is used to return the doctor details
