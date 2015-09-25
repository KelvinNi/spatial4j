package org.locationtech.spatial4j.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.util.VersionUtil;

/**
 * Automatically generated from PackageVersion.java.in during
 * packageVersion-generate execution of maven-replacer-plugin in
 * pom.xml.
 */
public final class PackageVersion implements Versioned {
  public final static Version VERSION = VersionUtil.parseVersion(
      "0.6-SNAPSHOT", "com.spatial4j", "spatial4j-jackson-databind");

  @Override
  public Version version() {
    return VERSION;
  }
}
