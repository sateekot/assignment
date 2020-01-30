# Steps to run the application.
1. Clone the repository
    git clone https://github.com/sateekot/assignment.git
2. Go to parent direcoty and run below to generate jar file.
    mvn clean install
3. Build the docker image
    docker build -t assignment .
4. Run the container
    docker run -p 5000:5000 assignment
5. Test the use cases using
    http://192.168.99.100:5000/greeting?account=personal&id=123 or http://localhost:5000/greeting?account=personal&id=123
