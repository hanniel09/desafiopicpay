
# Picpay challenge

Challenge from the company picpay which consists of a program that creates other users of two types, common and logistician. The common person can receive and send transfers, the logistician can only receive transfers.

- The transfer must go through a mocky if it is in that mocky that you have "authorized" the transfer will be sent.

- You can only have one user with one document and email. Another user cannot be created with the same data.


## API Reference

#### Get user

```SHELL
  GET /users
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `-`      | `-` | **Required**. Server running|

#### Create a user

```SHELL
  POST /users
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `firstName, lastName, document, email, password, balance, userType` | `JSON` | **Required**. Parameters to create a user |


#### Sender a transaction

```SHELL
  POST /transactions
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `amount, sender_id, receiver_id` | `JSON` | **Required**. Be a common user and have sufficient balance in your account |
## Tech Stack

**Server:** Spring, Java, H2(In memory database), maven

