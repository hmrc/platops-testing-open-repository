import play.core.PlayVersion
import sbt._

object AppDependencies {
  val compile = Seq(
    "uk.gov.hmrc"       %% "govuk-template"             % "5.59.0-play-27",
    "uk.gov.hmrc"       %% "play-ui"                    % "8.14.0-play-27",
    "uk.gov.hmrc"       %% "bootstrap-frontend-play-27" % "3.0.0"
  )

  val test = Seq(
    "org.scalatest"           %% "scalatest"                          % "3.1.2"             % Test,
    "org.scalatestplus.play"  %% "scalatestplus-play"                 % "4.0.0"             % "test, it",
    "com.vladsch.flexmark"    % "flexmark-all"                        % "0.35.10"           % Test,
    "com.typesafe.play"       %% "play-test"                          % PlayVersion.current % Test,
    "org.jsoup"               % "jsoup"                               % "1.10.2"            % Test,
    "org.seleniumhq.selenium" % "selenium-java"                       % "2.53.1"            % Test,
    "org.seleniumhq.selenium" % "selenium-htmlunit-driver"            % "2.52.0"            % Test,
    "uk.gov.hmrc"             %% "service-integration-test"           % "0.10.0-play-26"    % "test, it"
  )
}
