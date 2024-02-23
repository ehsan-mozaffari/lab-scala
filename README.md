# lab-scala

This is a Scala 2.13.x and 3 project for testing purposes. Mostly the code written in test section to learn more about the language and its libraries.

Wish you lock!


## How to run

Install `sbt`  and `bloop` and then `sbt bloopInstall` and then `bloop test root`.

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

To run the project run `sbt run` and chose between the different main of the application to run.

use `~ reStart` in sbt to hot reload the application. this is because the `sbt-resolver` plugin that automatically activates
on all the module. if you want to disable it on each module specifically you could add some config on that module

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).