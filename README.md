# hotel-booking
<b>Deploy to Heroku</b><br>
git push heroku master

<b>Authentication End point</b><br>
curl --location --request POST 'https://gk-booking-app.herokuapp.com/api/auth' \
--header 'Content-Type: application/json' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'username=jacksparrow' \
--data-urlencode 'password=jacksparrow123'
