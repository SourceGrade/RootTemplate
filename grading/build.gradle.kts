repositories {
  maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
  implementation("org.jagrkt:jagrkt-api:0.1.0-SNAPSHOT")
  implementation(project(":solution"))
}
