# Utveckling-Grupp-6

# A Contact List

This application is a small contact list that allows the user to show contacts, search, add and delete contacts.

To run the application you can either clone the repository and run the main.java class to start the program in the terminal.

Another option is to import it into jenkins and build the program in a different folder and branch and then run the script in 
the .bat file within the same folder as the created .jar file.

# How did we create the program?
We worked in unison and made a class each whilst also helping eachother with certain parts of the code. We had some problems integrating all
the different development tools, eventhough it was quite a learning experience! We made the program on Windows 10 in Eclipse in a Maven Project.
We integrated git in Eclipse to try the GUI to get a different view on how to work with git.

Jenkins Pipline Script:
Sandbox Groovy

node {
   git branch: 'main', credentialsId: 'e3274ae2-1094-4321-b518-9f8d2bee8ada', url: 'https://github.com/Marre89/Utveckling-Grupp-6.git'
    
    dir('contact-book') {
        bat 'mvn clean package'
        archiveArtifacts artifacts: 'target\\*.jar', followSymlinks: false
        javadoc javadocDir: '', keepAll: false
    dir('target') {
            writeFile encoding: 'utf-8', file: 'run.bat', text: 'java -jar contact-book-0.0.1-SNAPSHOT.jar'
}
    }
    
}
