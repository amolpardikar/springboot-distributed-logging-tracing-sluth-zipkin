Download Zipkin from maven repository get the latest zipkin jar.
And start it 

http://localhost:8080/
Shows a html page with contents fetched from microservice-4 utility class.

Lets follow below steps to test the whole application. Screenshots are also provided to make testing easier.

1) Start Zipkin Server (java -jar zipkin-server-2.12.9-exec.jar)

2) Start All Microservices one by one

3) Enter URL: http://localhost:8081/m1

4) Open a new browser window and enter http://localhost:9411/zipkin

5) Click on Find Trace. You will see details of three running microservices highlighted in green color.

6) Click on Blue color bar. You will see trace record of each microservice.

7) Click on any one option. Let’s click on ‘microservice#2’. A new popup window will appear with all the details.

8) Click on ‘Show IDs’, you will find details of traceId, spanId and parentId. Now, copy traceId from here.

9) Open Log files and search(ctrl+F) with traceId to see all log lines related to current request.

References:
https://javatechonline.com/how-to-implement-distributed-logging-tracing-using-sleuth-zipkin/

https://www.javainuse.com/spring/cloud-sleuth

