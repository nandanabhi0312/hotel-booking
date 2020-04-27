# hotel-booking
<b>Deploy to Heroku</b><br>
git push heroku master

<b>API documentation</b><br>
https://gk-booking-app.herokuapp.com/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

<b>Running the app locally</b><br>
#Clone the repository<br>
git clone https://github.com/nandanabhi0312/hotel-booking.git<br>
cd hotel-booking

#Windows<br>
mvnw.cmd clean install

#Run the app locally. Do not run this if you want to create a docker image and run docker container<br>
java -jar target\gk-hotel-booking-1.0-SNAPSHOT.jar

#Skip the above step (Run the app locally) and use the following steps to create docker image and run as docker container<br>
docker build -f Dockerfile -t gk-hotel-booking .

#Check if the image is created successfully, You should see an image with REPOSITORY gk-hotel-booking<br>
docker images

#Start the docker container<br>
docker run -d -p 8080:8080 --name gkhotelbooking gk-hotel-booking


<b>API Documentation</b><br>
http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config
