## NOTIFICATION SERVICE

* This service is implemented on Observer pattern,
  whereas a notification arrives
  on the source and is distributed to the subscribed users.
* Basic services are Email ans SMS which are extensible .

### API DESIGN

#### 1. USER       /notification/users
* The API returns the list of users available in the notification service
* 