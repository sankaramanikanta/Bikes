

# Identify New Bikes


Retrieve information about upcoming bikes from the manufacturer ‘Honda’ that are expected to launch in India.Compile a list of popular used car models available in Chennai.And attempt a login with incorrect Google account credentials and capture any error messages.
 


### Installation

 - Eclipse as a platform for writing selenium scripts
 - Cucumber used for implementing the test scripts
 - Apache POI for Collecting data in the Excel File
 - TestNG used to implement the test cases.
    
### Dependencies

###### Selenium 
<dependency>
    
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.17.0</version>
</dependency>

###### Apache POI
<dependency>

    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.5</version>
</dependency>

<dependency>

    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.4</version>
</dependency>


###### Cucumber
<dependency>

    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.15.0</version>

</dependency>

###### TestNG
<dependency>

    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
</dependency>	

###### ExtentReports
<dependency>
	
    <groupId>tech.grasshopper</groupId>
	<artifactId>extentreports-cucumber7-adapter</artifactId>
	<version>1.14.0</version>

</dependency>
	
### Automation process
1. Display "Upcoming" bikes details like bike name, price and expected launch date in India, for manufacturer 'Honda' & Bike price should be less than 4Lac.
2. For Used cars in Chennai, extract all the popular models in a List; Display the same
3. Try to 'Login' with google, give invalid account details & capture the error message
 


### Sources 

##### Maven Repository
- https://mvnrepository.com/

##### Url of urbanladder
- https://www.zigwheels.com/

### In the Project
- Selenium
- Apache POI
- Cucumber 
- TestNG
- POM (Page Object Model)
- Logs
- Reports
- Selenium grid
- Git ,GitHub
- Jenkins
### Key Automation Scope
1. Handling Windows & Frames:
We’ll manage different browser windows and frames
 
2. Capturing Warning Messages:
If any warnings or errors occur during data retrieval, we’ll capture and handle them appropriately.
 
3. Extracting Menu Items:
If menu items are relevant (e.g., bike details), we’ll extract and store them for further use.
 
4. Navigating Back to Home Page:
After completing specific tasks, we’ll ensure smooth navigation back to the home page.