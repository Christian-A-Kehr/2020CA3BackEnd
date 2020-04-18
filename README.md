[![Build Status](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode.svg?branch=master)](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode)

*This project is meant as start code for projects and exercises given in Flow-1+2 at http://cphbusiness.dk in the Study Program "AP degree in Computer Science"*

*Projects which are expected to use this start-code are projects that require all, or most of the following technologies:*
 - *JPA and REST*
- *Testing, including database test*
- *Testing, including tests of REST-API's*
- *CI and CONTINUOUS DELIVERY*

### Preconditions
*In order to use this code, you should have a local developer setup + a "matching" droplet on Digital Ocean as described in the 3. semester guidelines* 
# Getting Started

### How to use:

For now all test classes and login classes are dependant on the RenameMe entities

- Change target server in 'Project Files/pom.xml' (line 18) Remember to use https
- Change database name in 'Source Packages/rest/Resource Classes' (line 19)
- Change database name in the 'travis.yml' file (line 43)
- Change database name in 'Test Packages/facades/FacadeTest Classes (line 32)'
- Change database name in 'Other Sources/src/main/resources/default package/config.properties' (line 17 + line 21)

To populate droplet database with dummy users, tempoarily change the data in 'Other Sources/src/main/resources/default package/config.properties'
to point at the droplet (line 11-14) then change back to localhost.

- All current DTO classes as well as the JokeResource.java class are just examples meant to be used as a template for remote api fetching.
- DemoResource.java is used to confirm the existence of users in the database.
- The RenameMeResource.java, RenameMe.java and FacadeExample (as well as tests for these) are templates that can be changed or copied.
- Role.java and User.java are currently sufficient for a basic user/admin system. Will need modification only if required.
- The errorhandling folder and security folder doesn't require editing for new projects.

### After project completion:

- Remove 'Source Packages/security/SharedSecret.java' when finished with project (line 23)
- Remove 'Source Packages/utils/setupTestUsers.java' using gitignore when pushing a proper project

For more info: https://github.com/dat3startcode/rest-jpa-devops-startcode/blob/master/README_proof_of_concept.md