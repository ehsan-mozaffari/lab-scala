// Integrate bloop with Sbt and it is mandatory
addSbtPlugin("ch.epfl.scala" % "sbt-bloop"    % "1.5.11")
// Use .scalafmt formatter to format the code automatically when running sbt
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
/* sbt-revolver is a plugin for SBT enabling a super-fast development turnaround for your Scala applications.
 * use this command to watch server: ~reStart <args> --- <jvmArgs> see the doc for more valuable info
 */
addSbtPlugin("io.spray"      % "sbt-revolver" % "0.10.0")
