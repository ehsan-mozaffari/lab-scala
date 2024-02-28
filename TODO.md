# Todo

* Add docker for the lab and implement app based on the docker and docker compose
* Add docker dev container to this with some recommendation extension for vscode. (use ubuntu not alpine because it is a dev container) and check if you could use ubuntu for dev container and alpine for running the application in docker.
* Add ZIO test
* XRAY, Native Test Management tools
* Add multiple module for each technologies like zio, typelevel and then force dependencies for each library via defining vars for each section.
* Add publisher to maven to use the library to publish to maven repo and also nexus repository manager.
* publish custome exception ADP in abstract way and write some handler for other liberaries like Tapir. and add it to a library for example: a lib called `global-exception` and the other one called `global-exception-tapir` or `global-exception-zio` that handles by zio and you could use the benefits of zio after adding it and for tapir it could be add `global-exception-endpoint` endpoint with doc to handle the exceptions for tapir.
* Add Abstraction classes on the src main and the learning material in the test section.
* Add Kafka producer and consumer in Akka Stream, ZIO, and typelevel libraries and publish them to maven.
* Write some integration tests for Kafka that runs Kafka and run the tests like test-toolkits or even running the real kafka for testing!
* See if you could use docs repository in this repo to avoid adding more stuf here.
* Comments to all of your implemetation as you want this repo as reference.
* Add scalafix, scalafmt, scala steward and auto version updater in this repo as you want to be in the company and see if you could add them like a sbt plugins to just add it in the `plugins.sbt`
