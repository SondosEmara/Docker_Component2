# Docker_Component2
<pre>
   <h1>Command Run Docker Compose File</h1>
   
   <b>docker-compose run service1</b>
   <b>docker-compose run service2</b>
   
   In Case Change the CSV Files change that in the dockerCompose file by edit this
   ./Data:/app/data/batch in each service with specific path in local.

   In Component2 We will Build and Push the Image to Docker Hub using Repo
     -->sondos2002/component2
   The Component2 image 
     --> get from build the Dockerfile exist in Folder (Component2_Code)
   
   In Data Folder
      --> that is the CSV Files that used to mount to \app\data\batch in each service in the Docker compose file.
   
   In (docker-compose.yml) make two Services 
      the service1 have image that is push in the Component1
      the service2 have image that is push in the Component2
      exist mount the ./Data to the \app\data\batch 
      exist shared volume between two Service.
     
   
<pre/>
