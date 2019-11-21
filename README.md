## Getting Started

Developed with Eclipse IDE, OS(Used windows 10).

### Prerequisites

-JDK(Version 13);

-Eclipse EE IDE Eclipse IDE for Enterprise Java Developers.

Version: 2019-09 R (4.13.0)

Build id: 20190917-1200

OS: Windows 10, v.10.0, x86_64 / win32

Java version: 1.8.0_231

-MySql version 8.0 (Developer version with server and client side);


### Installing

- Open the sql workbench and excetute

```
CREATE database fxdemo;

USE fxdemo;

CREATE table employee(
	id int primary key auto_increment not null,
	first_name varchar(45) not null,
	last_name varchar(45) not null,
	email varchar(45) not null,
);
```

-Unzip the file;

-Open Eclipse -> Open file


## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
