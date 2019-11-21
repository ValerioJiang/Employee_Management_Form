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
