workspace(name = "second_party_example")

#load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
#
#rules_scala_version="326b4ce252c36aeff2232e241ff4bfd8d6f6e071" # update this as needed
#http_archive(
#             name = "io_bazel_rules_scala",
#             url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
#             type = "zip",
#             strip_prefix= "rules_scala-%s" % rules_scala_version
#             )

local_repository(
    name = "io_bazel_rules_scala",
    path = "/Users/shain/code/wix_rules_scala"
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scala_proto_repositories")
scala_proto_repositories()


http_archive(
    name = "com_google_protobuf",
    sha256 = "118ac276be0db540ff2a89cecc5dfb9606d4d16e91cc4ea8883ae8160acb5163",
    strip_prefix = "protobuf-0456e269ee6505766474aa8d7b8bba7ac047f457",
    urls = ["https://github.com/google/protobuf/archive/0456e269ee6505766474aa8d7b8bba7ac047f457.zip"],
)

http_archive(
    name = "com_google_protobuf_java",
    sha256 = "118ac276be0db540ff2a89cecc5dfb9606d4d16e91cc4ea8883ae8160acb5163",
    strip_prefix = "protobuf-0456e269ee6505766474aa8d7b8bba7ac047f457",
    urls = ["https://github.com/google/protobuf/archive/0456e269ee6505766474aa8d7b8bba7ac047f457.zip"],
)

