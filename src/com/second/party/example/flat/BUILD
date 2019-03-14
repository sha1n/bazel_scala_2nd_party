load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "2nd_party_example_flat",
    srcs = [
        "FlatSecondPartyExample.scala",
        "FlatAJavaClass.java",
        ],
    visibility = ["//visibility:public"],
    deps = [
        "//src/proto/com/second/party/example/proto:proto_scala",
    ]
)