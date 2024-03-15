# ip-insight

IPInsight is a Java project designed to analyze and manage IP addresses, providing insights into geolocation data and other relevant information.

# Overview
IPInsight leverages various APIs and libraries to perform the following tasks:

Reading Configuration: Load configuration settings from a config.properties file to customize the behavior of the application.
IP Analysis: Utilize the IPinfo.io API to retrieve geolocation and other data for a given IP address.
Data Presentation: Display relevant information about the IP address, such as country, city, latitude, longitude, and more.
Features
Configurable: Easily customize the project settings by editing the config.properties file.
API Integration: Seamlessly integrate with IPinfo.io API to gather IP information.
User-Friendly: Present the IP analysis results in a clear and understandable format.
Getting Started
To get started with IPInsight, follow these steps:

Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/your-username/ip-insight.git
Open the project in your preferred Java IDE.

Modify the config.properties file in the src/main/resources directory to include your API key for IPinfo.io.

Build and run the project.

# Usage
After setting up the project, you can use it to analyze IP addresses:

Run the application.
Enter the IP address you want to analyze when prompted.
The application will retrieve and display information about the specified IP address.
Dependencies
IPinfo.io API
Java Properties
Contributing
Contributions are welcome! Feel free to fork the repository, make changes, and submit a pull request.
