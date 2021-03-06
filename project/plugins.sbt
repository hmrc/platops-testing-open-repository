resolvers += Resolver.bintrayIvyRepo("hmrc", "sbt-plugin-releases")
resolvers += Resolver.bintrayRepo("hmrc", "releases")
resolvers += Resolver.typesafeRepo("releases")
resolvers += Resolver.jcenterRepo

addSbtPlugin("com.typesafe.play" %  "sbt-plugin"            % "2.8.7")
addSbtPlugin("uk.gov.hmrc"       %  "sbt-auto-build"        % "2.13.0")
addSbtPlugin("uk.gov.hmrc"       %  "sbt-git-versioning"    % "2.2.0")
addSbtPlugin("uk.gov.hmrc"       %  "sbt-distributables"    % "2.1.0")
addSbtPlugin("org.scalastyle"    %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage"     %  "sbt-scoverage"         % "1.6.1")
addSbtPlugin("org.irundaia.sbt"  %  "sbt-sassify"           % "1.5.1")
