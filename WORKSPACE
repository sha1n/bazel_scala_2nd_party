workspace(name = "second_party_example")

rules_scala_version="326b4ce252c36aeff2232e241ff4bfd8d6f6e071" # update this as needed
http_archive(
             name = "io_bazel_rules_scala",
             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
             type = "zip",
             strip_prefix= "rules_scala-%s" % rules_scala_version
             )

#local_repository(
#    name = "io_bazel_rules_scala",
#    path = "/Users/shain/code/wix_rules_scala"
#)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

