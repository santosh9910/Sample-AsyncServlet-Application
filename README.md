# Sample-AsyncServlet-Application
This repository contains a simple Java web application that demonstrates the use of asynchronous servlets. The application is designed to handle requests asynchronously and send responses after a delay.

**Features**

Implements asynchronous request handling using Servlet 3.0 API.

Delivers a delayed response to simulate long-running tasks.

Lightweight and easy-to-run example for beginners.

**Prerequisites**

To run this application, ensure that the following software is installed on your system:

Java Development Kit (JDK) - Version 23 or higher.

Apache Tomcat or any other compatible servlet container.

Maven - For building the application.

**Usage**

Once the application is running, you can test it by visiting the following URL in your web browser or using a tool like curl:

http://localhost:8080/DAsyncServletExample/asyncExample

**Example** Output

After accessing the URL, the application responds with a delay. The output will look like this:

Async response from servlet after delay!
Host: localhost
Port: 8080

**How It Works**

When a request is received, the servlet starts processing it asynchronously.

A delay is simulated (e.g., using Thread.sleep or a scheduled task).

The servlet sends the response back to the client once processing is complete.
