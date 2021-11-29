### 다재다능 FE (Android) Repo ###


### 1. 개요

위드코로나 시대, 우리는 일상으로 돌아갈 때입니다.<br>
_다재다능_ 은 재능으로 대학생과 대학생을 연결해주는 서비스입니다.

### 2. Data flow 

<img src="https://cdn.discordapp.com/attachments/893402371684728895/914389655749812224/cif00001.png">


### 3. Architecture diagram

<img src="https://cdn.discordapp.com/attachments/893402371684728895/914389385049432115/cif00001.png">

### 4. ENVIRONMENT

1. .env.develoement
2. .env.production
3. .env.test

example)
```
# Service Server Port number
PORT=

# URL of the Mongo DB
MONGODB_URL=

# AWS KEY
ACCESSKEYID=
SECRETACCESSKEY=
REGION=

MAIL_ACCESSKEYID=
MAIL_SECRETACCESSKEY=

# JWT
# JWT secret key
JWT_SECRET=
# Number of minutes after which an access token expires
JWT_ACCESS_EXPIRATION_MINUTES=
# Number of days after which a refresh token expires
JWT_REFRESH_EXPIRATION_DAYS=
```
