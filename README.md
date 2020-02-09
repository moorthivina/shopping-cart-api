# Shopping Card API

## Endpoints
### Health Check
```
GET /shopping/actuator/health HTTP/1.1
Host: localhost:8080
```
### Submit Order 
```
POST /shopping/cart/submit HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

{
	"orderId": 1,
	"orderTotal": 50,
	"orderDetails": [
		{
			"productId": 1,
			"productPrice": 20
		}, 
		{
			"productId": 2,
			"productPrice": 30
		}
	]
}
```

## H2 Console URL 
```
http://localhost:8080/shopping/h2-console

Driver: org.h2.Driver
JDBC URL: jdbc:h2:mem:test;
User: sa
Password: sa
```

