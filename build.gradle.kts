import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml

plugins {
  `java-library`
  id("io.papermc.paperweight.userdev") version "1.7.1"
  id("xyz.jpenilla.run-paper") version "2.3.0"
  id("xyz.jpenilla.resource-factory-bukkit-convention") version "1.1.1"
}

group = "net.slqmy.stronger_fishing_rods_plugin"
version = "1.0-SNAPSHOT"

val javaVersion = 21
val paperApiVersion = "1.21"

java {
  toolchain.languageVersion = JavaLanguageVersion.of(javaVersion)
}

dependencies {
  paperweight.paperDevBundle(paperApiVersion + "-R0.1-SNAPSHOT")
}

tasks {
  compileJava {
    options.release = javaVersion
  }

  javadoc {
    options.encoding = Charsets.UTF_8.name()
  }
}

bukkitPluginYaml {
  main = project.group.toString() + ".StrongerFishingRodsPlugin"
  load = BukkitPluginYaml.PluginLoadOrder.STARTUP
  authors.add("Slqmy")
  apiVersion = paperApiVersion
}
